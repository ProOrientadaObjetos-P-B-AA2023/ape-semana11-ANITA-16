
package problematica_2;

import java.util.ArrayList;
import java.util.List;


public class Ejecutor001 {

    public static void main(String[] args) {
        //Dos objetos de tipo menú de niños
       List<Menu> listaMenus1 = new ArrayList<>();
       
       Menu_Kid menuKid1 = new Menu_Kid(2,3,"Deditos de Pollo",5,5);
       Menu_Kid menuKid2 = new Menu_Kid(3,4,"Pizza",7,7);
       listaMenus1.add(menuKid1);
       listaMenus1.add(menuKid2);
        //Un objeto de tipo menú de económico
       Menu_Economico menuEconomico1 = new Menu_Economico(12.5,"Pasta",3,3);
       listaMenus1.add(menuEconomico1);
        //Un objeto de tipo menú del día
       Menu_Dia menuDia1 = new Menu_Dia(6,2,"Bistec de Carne",8,10);
       listaMenus1.add(menuDia1);
       //Un objeto de tipo menú a la carta.
       Menu_Carta menuCarta1 = new Menu_Carta(5,2,5,"Lasaña ",10,10);
       listaMenus1.add(menuCarta1);
       
       //Un objeto de tipo Cuenta
       Cuenta cuenta1 = new Cuenta("Sebastian",listaMenus1,12); 
       
       cuenta1.calcularValorSubtotal();
       cuenta1.calcularValorTotal();
       
        System.out.println(cuenta1.toString());
    }
    
}
