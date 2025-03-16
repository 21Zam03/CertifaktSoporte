/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.certifakt.soporte;

import com.mycompany.certifakt.soporte.apiservice.CertifaktService;
import com.mycompany.certifakt.soporte.config.ConfigFile;
import com.mycompany.certifakt.soporte.payload.dto.UserDto;
import com.mycompany.certifakt.soporte.view.LoginView;
import com.mycompany.certifakt.soporte.view.WelcomeView;

public class CertifaktSoporte {
    
    public static void main(String[] args) {
        ConfigFile.cargarConfiguracion();
        
        UserDto userDto = CertifaktService.validateSession();
        if(userDto != null) {
            WelcomeView welcomeView = new WelcomeView();
            welcomeView.setVisible(true);
            welcomeView.setLocationRelativeTo(null);
        } else {
            LoginView loginView = new LoginView();
            loginView.setVisible(true);
            loginView.setLocationRelativeTo(null);
        }
    }
    
}
