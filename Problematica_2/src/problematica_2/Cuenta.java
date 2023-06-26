
package problematica_2;

import java.util.List;


public class Cuenta {
    public String nombreCliente;
    public List<Menu> listadoMenus;
    public double valorTotal;
    public double valorSubtotal;
    public double iva;

    public Cuenta() {}
    public Cuenta(String nombreCliente, List<Menu> listadoMenus, double iva) {
        this.nombreCliente = nombreCliente;
        this.listadoMenus = listadoMenus;
        this.iva = iva;
    }
    
    /* tambien se puede usar de esta manera
    public Cuenta(String nombreCliente,double iva) {
        this.nombreCliente = nombreCliente;
        this.listadoMenus = new ArrayList<>();
        this.iva = iva;
    }

    public void agregarMenuEnLista(Menu mn){
        this.listadoMenus.add(mn);
    }
    */
    public void calcularValorSubtotal(){
        this.valorSubtotal = 0;
        for(Menu menu : listadoMenus){
            this.valorSubtotal += menu.getValorMenu();
        }
    }
    
    public void calcularValorTotal(){
        this.valorTotal = ( this.valorSubtotal + (this.valorSubtotal/100) );
    }

    @Override
    public String toString() {
        
        return "====================================================\n"+
                "                       CUENTA\n"+ 
               "====================================================\n"+
                "Nombre del Cliente = " + nombreCliente + "\n" + 
                "Listado de Menus: " + "\n" + listadoMenus + "\n" + 
                "Valor Total = " + valorTotal + "\n" + 
                "Valor Subtotal = " + valorSubtotal + "\n" + 
                "IVA = " + iva ;
    }

}