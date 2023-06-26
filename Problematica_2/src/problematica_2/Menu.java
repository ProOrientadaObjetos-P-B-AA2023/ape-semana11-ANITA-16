
package problematica_2;

abstract class Menu {
    public String nombrePlato;
    public double valorMenu;
    public double valorInicialMenu;

    public Menu() {}
    public Menu(String nombrePlato, double valorMenu, double valorInicialMenu) {
        this.nombrePlato = nombrePlato;
        this.valorMenu = valorMenu;
        this.valorInicialMenu = valorInicialMenu;
    }

    public double getValorMenu() {
        return valorMenu;
    }
    
    @Override
    public String toString() {
        return "---------------------------------------------------\n"+
                "                       Menu\n"+ 
               "---------------------------------------------------\n"+
               "Nombre del Plato = " + nombrePlato + "\n" + 
               "Valor Menu = " + valorMenu + "\n" + 
               "Valor Inicial del Menu = " + valorInicialMenu + "\n";
    }
}

class Menu_Carta extends Menu{
    public double valorPorcion;
    public double valorBebida;
    public double porcentajeAdicionalServicio;

    public Menu_Carta() {}
    public Menu_Carta(double valorPorcion, double valorBebida, double porcentajeAdicionalServicio, String nombrePlato, double valorMenu, double valorInicialMenu) {
        super(nombrePlato, valorMenu, valorInicialMenu);
        this.valorPorcion = valorPorcion;
        this.valorBebida = valorBebida;
        this.porcentajeAdicionalServicio = porcentajeAdicionalServicio;
    }

    @Override
    public String toString() {
        return super.toString() +
               "Valor de porcion de Guarnicion = " + valorPorcion + "\n"+
               "Valor de Bebida = " + valorBebida + "\n"+
               "Porcentaje Adicional por Servicio en relación del valor inicial del menú = " + porcentajeAdicionalServicio + "\n" + 
               "Tipo de Menu -> Menu a la Carta\n";
    }    
}

class Menu_Dia extends Menu{
    public double valorPostre;
    public double valorBebida;

    public Menu_Dia() {}
    public Menu_Dia(double valorPostre, double valorBebida, String nombrePlato, double valorMenu, double valorInicialMenu) {
        super(nombrePlato, valorMenu, valorInicialMenu);
        this.valorPostre = valorPostre;
        this.valorBebida = valorBebida;
    }
    
    @Override
    public String toString() {
        return super.toString() +
                "Valor de Postre = " + valorPostre + "\n"+
                "Valorde Bebida = " + valorBebida + "\n" + 
               "Tipo de Menu -> Menu del Dia\n";
    } 
}

class Menu_Kid extends Menu{
    public double valorPorcionHelado;
    public double valorPorcionPastel;

    public Menu_Kid() {}
    public Menu_Kid(double valorPorcionHelado, double valorPorcionPastel, String nombrePlato, double valorMenu, double valorInicialMenu) {
        super(nombrePlato, valorMenu, valorInicialMenu);
        this.valorPorcionHelado = valorPorcionHelado;
        this.valorPorcionPastel = valorPorcionPastel;
    }
    
    @Override
    public String toString() {
        return super.toString() +
                "Valor de Porcion de Helado = " + valorPorcionHelado + "\n"+
                "Valor de Porcion de Pastel = " + valorPorcionPastel + "\n" + 
               "Tipo de Menu -> Menu de Niños.\n";
    } 
}

class Menu_Economico extends Menu{
    public double porcentajeDescuento;

    public Menu_Economico() {}
    public Menu_Economico(double porcentajeDescuento, String nombrePlato, double valorMenu, double valorInicialMenu) {
        super(nombrePlato, valorMenu, valorInicialMenu);
        this.porcentajeDescuento = porcentajeDescuento;
    }

    @Override
    public String toString() {
        return super.toString()+
               "Porcentaje de Descuento, en refercia al Valor Inicial del menu = " + porcentajeDescuento + "\n" + 
               "Tipo de Menu -> Menu Economico.\n";
    }
    
}
