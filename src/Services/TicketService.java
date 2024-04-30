package Services;

import Exceptions.InvalidException;
import Modules.Gates;
import Modules.Ticket;
import Modules.Vehicle;
import Modules.VehicleType;
import Repositries.GateRepository;
import Repositries.VehicleRepository;

import java.util.Date;
import java.util.Optional;

public class TicketService {
    private GateRepository gateRepository;
    private VehicleRepository vehicleRepository;


    public  TicketService(GateRepository gateRepository, VehicleRepository vehicleRepository){
        this.gateRepository = gateRepository;
        this.vehicleRepository = vehicleRepository;
    }
    public Ticket generateTicket(Long gateId, String VehicleNumber, VehicleType vehicleType, String ownerName) throws InvalidException {
        Ticket ticket = new Ticket();
        ticket.setEntryTime(new Date());
        Optional<Gates> optionalGate = gateRepository.findById(gateId);
        if(optionalGate.isEmpty()){
           throw new InvalidException("Invalid Gate Id");
        }

        Gates gate = optionalGate.get();
        ticket.setGenratedAt(gate);
        ticket.setGenratedBy(gate.getOperator());

        Optional<Vehicle> optionalVehicle = vehicleRepository.findByNumber(VehicleNumber);
        Vehicle vehicle ;
        if(optionalVehicle.isPresent()){
            vehicle = optionalVehicle.get();
        }
        else{
             vehicle = new Vehicle();
            vehicle.setOwnerName(ownerName);
            vehicle.setVehiclenumber(VehicleNumber);
            vehicle.setVehicleType(vehicleType);
            vehicleRepository.save(vehicle);
            ticket.setVehicle(vehicle);



        }
        return ticket;
    }
}
