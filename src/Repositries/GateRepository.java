package Repositries;

import Modules.Gates;

import java.util.*;

public class GateRepository {
    private Map<Long, Gates> gates = new HashMap<>();
    public Optional<Gates> findById(Long gateid) {
        if (gates.containsKey(gateid)) {
            return Optional.of(gates.get(gateid));
        }

            return Optional.empty();
    }

}
