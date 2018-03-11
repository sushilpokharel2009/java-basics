package co.rel;

public class CookingTime{
   // integers for storing minutes and seconds

   private int hour;

   private int minute;

   private int second;

   private int hourValue;

   private int minuteValue;

   private int secondValue;

   // set hour value

   public CookingTime() {
	   setHour( hourValue );

	      setMinute( minuteValue );

	      setSecond( secondValue );
  }



	public int getHour(){
	      return hour;	
	   }

    

   public void setHour( int h ){
      if ( h < 10 ){
           hour = h;
      }
      else
      {
           hour = 0;

      }

   } // end method setHour

    

   public int getMinute(){   
      return minute;
   } // end method getMinute

    

   // set minute value

   public void setMinute( int value ){
      if ( value >= 0 && value < 60 )
      {
         minute = value;
      }
      else // set invalid input to 0
      {
         minute = 0;
      } 
   } // end method setMinute

    

   // return second value

   public int getSecond(){
      return second;
   } // end method getSecond

 

   // set second value

   public void setSecond( int value ){
      if ( value >= 0 && value < 60 ){
         second = value;
      }
      else // set invalid input to 0
      {
         second = 0;
      }
   } // end method setSecond

 

   // return whether or not the time has reached zero

   public boolean isDone(){
      return ( hour == 0 && minute == 0 && second == 0 );
   } // end method isDone

 

   // decrement the time by one second
   public void tick(){
      // handle case when seconds need to be decremented
      if ( getSecond() > 0 )
      {
         setSecond( getSecond() - 1 ); // subtract one second
      }

      // handle case when minutes must be decremented
      else if ( getMinute() > 0 )
      {
         setMinute( getMinute() - 1 ); // subtract one minute

         setSecond( 59 );         
      }

      // handle case when hours must be decremented
      else if( getHour() > 0 )
      {
            setHour( getHour() - 1 ); // subtract one hour
            setMinute( 59 );
      }
   } // end method tick

} // end class CookingTime

