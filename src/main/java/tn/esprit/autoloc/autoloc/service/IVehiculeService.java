package tn.esprit.autoloc.autoloc.service;

import tn.esprit.autoloc.autoloc.domain.Vehicule;

import java.util.List;

public interface IVehiculeService {

    Vehicule addVehicule(Vehicule vehicule);

    Vehicule updateVehicule(Vehicule vehicule);

    Vehicule retrieveVehicule(Long id);

    List<Vehicule> retrieveAllVehicules();

    void removeVehicule(Long id);
}