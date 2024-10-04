package com.Z_India.realty.service.EnqueryUserServices;

import com.Z_India.realty.Repository.EnquieryUsersRepo;
import com.Z_India.realty.entity.EnquieryUsers;
import com.Z_India.realty.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EnqueryUserServicesImpl implements EnqueryUserServices{


    EnquieryUsersRepo enquieryUsersRepo;

    @Override
    public EnquieryUsers addEnqueryUser(EnquieryUsers enquieryUsers) {
        return enquieryUsersRepo.save(enquieryUsers);
    }

    @Override
    public void storeUserDetails(EnquieryUsers enquieryUsers) {
        enquieryUsersRepo.save(enquieryUsers);
    }
}
