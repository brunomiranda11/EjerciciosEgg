
package principal;

import principal.servicios.TiendaServicios;

 class MainClass {


    public static void main(String[] args) throws Exception {
        TiendaServicios st = new TiendaServicios();
        try {
            st.menu();
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
            throw e;
            
            
        }
    }
    
}
