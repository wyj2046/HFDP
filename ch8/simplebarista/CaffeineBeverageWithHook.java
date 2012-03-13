public abstract class CaffeineBeverageWithHook
{
  final void prepareRecipe()
  {
    boilWater();
    brew();
    pourInCup();
    if (customerWantsCondiments())
    {
      addCondiments();
    }    
  }

  abstract void brew();
  abstract void addCondiments();

  public void boilWater()
  {
    System.out.println("Boiling Water");
    
  }

  public void pourInCup()
  {
    System.out.println("Pouring into cup");
    
  }

  boolean customerWantsCondiments()
  {
    return true;
    
  }
  
}
