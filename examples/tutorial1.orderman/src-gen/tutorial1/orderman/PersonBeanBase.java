package tutorial1.orderman;

import tutorial1.EqualityHelper;

public abstract class PersonBeanBase
{
  protected int id;
  protected String name;
  protected double income;

  private java.util.List<Listener> listeners = new java.util.ArrayList<Listener>();

  public PersonBeanBase(int id, String name, double income)
  {
    this.id = id;
    this.name = name;
    this.income = income;
  }

  public int getId()
  {
    return id;
  }

  public String getName()
  {
    return name;
  }

  public void setName(String newName)
  {
    String oldName = name;
    if (!EqualityHelper.equals(oldName, newName))
    {
      name = newName;
      for (Listener listener : listeners)
        listener.notifyNameChanged(this, oldName, newName);
    }
  }

  public double getIncome()
  {
    return income;
  }

  public void setIncome(double newIncome)
  {
    double oldIncome = income;
    if (!EqualityHelper.equals(oldIncome, newIncome))
    {
      income = newIncome;
      for (Listener listener : listeners)
        listener.notifyIncomeChanged(this, oldIncome, newIncome);
    }
  }

  public void addListener(Listener listener) { listeners.add(listener); }
  
  public void removeListener(Listener listener) { listeners.remove(listener); }

  public interface Listener
  {
    void notifyNameChanged(PersonBeanBase source, String oldName, String newName);
    void notifyIncomeChanged(PersonBeanBase source, double oldIncome, double newIncome);
  }
}
