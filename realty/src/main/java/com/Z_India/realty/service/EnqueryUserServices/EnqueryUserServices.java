package com.Z_India.realty.service.EnqueryUserServices;

import com.Z_India.realty.entity.EnquieryUsers;
import com.Z_India.realty.entity.User;

public interface EnqueryUserServices {

    EnquieryUsers addEnqueryUser(EnquieryUsers enquieryUsers);

    void storeUserDetails(EnquieryUsers enquieryUsers);
}
