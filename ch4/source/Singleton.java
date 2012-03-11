public class Singleton
{
  private static Singleton uniqueIntance;
  private Singleton();
  public static Singleton getInstance()
  {
    if (uniqueIntance == null)
    {
      uniqueIntance = new Singleton();
      
    }

    return uniqueIntance;
    
  }
  
}
