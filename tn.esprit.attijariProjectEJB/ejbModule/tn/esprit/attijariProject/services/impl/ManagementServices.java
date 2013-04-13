package tn.esprit.attijariProject.services.impl;

import javax.ejb.Stateless;
import tn.esprit.attijariProject.services.interfaces.ManagementServicesLocal;
import tn.esprit.attijariProject.services.interfaces.ManagementServicesRemote;

/**
 * Session Bean implementation class ManagementServices
 */
@Stateless
public class ManagementServices implements ManagementServicesRemote, ManagementServicesLocal {

    /**
     * Default constructor. 
     */
    public ManagementServices() {
        // TODO Auto-generated constructor stub
    }

}
