import java.util.*;

public class MenuTestDrive
{
  public static void main(String[] args)
  {
    PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
    DinerMenu dinerMenu = new DinerMenu();
    CafeMenu cafeMenu = new CafeMenu();
    ArrayList menus = new ArrayList();
    menus.add(pancakeHouseMenu);
    menus.add(cafeMenu);
    menus.add(cafeMenu);
    //    Waitress waitress = new Waitress(pancakeHouseMenu, dinerMenu, cafeMenu);
    Waitress waitress = new Waitress(menus);
    waitress.printMenu();    
  }  
}
