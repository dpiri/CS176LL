public class Data {

	   public static double average(Mesasurable[] objects)
	   {
	      double sum = 0;
	      
	      for (Mesasurable obj : objects)
	      {
	         sum = sum + obj.getMeasure();
	      }
	      if (objects.length > 0)
	      {
	         return sum / objects.length;
	      }
	      else
	      {
	         return 0;
	      }
	   }

	   public static double max(Mesasurable[] objects)
	   {
	      if (objects.length == 0)
	      {
	         return 0;
	      }
	      double max = 0;
	      for (Mesasurable obj : objects)
	      {
	         if (obj.getMeasure() > max)
	         {
	            max = obj.getMeasure();
	         }
	      }

	      return max;
	   
	}

	public static double min(Mesasurable[] objects) {
		
		// TODO Auto-generated method stub
		return 0;
	}

}
