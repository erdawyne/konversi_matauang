/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ti.umy.pratikum.konversi;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author Hawe
 */

@Controller
public class fileController {
    @RequestMapping("/convertion")
    @ResponseBody
    public String getUang() {
        String konversi = " ";
        
        double rp = 17500;
        double dolar = 53;
        double rm = 350;
        
        double matauang;
        
        String pilih = "dolartorp"; //pilihan untuk dikonversi
        
        if(pilih=="rptorm") { //rupiah ke rimggit
            matauang = rp/3409.14;
            konversi = "jumlah ringgit = " + matauang;
        }else if(pilih =="dolartorp") { //dolar ke rupiah
            matauang = dolar*14144;
            konversi = "jumlah rupiah : " + matauang;        
        }else{
            konversi = "tidak di temukan";
        }
        
        return konversi;
    
    
    
    
    }
}
