package RTC;

/**
* RTC/RETURN_VALUEHolder.java .
* IDL-to-Java?????(?????)??????"3.2"???????????
* idl/MobileRobot.idl??
* 2015?5?12? 15?55?36? JST
*/

public final class RETURN_VALUEHolder implements org.omg.CORBA.portable.Streamable
{
  public RTC.RETURN_VALUE value = null;

  public RETURN_VALUEHolder ()
  {
  }

  public RETURN_VALUEHolder (RTC.RETURN_VALUE initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = RTC.RETURN_VALUEHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    RTC.RETURN_VALUEHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return RTC.RETURN_VALUEHelper.type ();
  }

}
