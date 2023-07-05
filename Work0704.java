package day0704;


import java.util.Calendar;

public class Work0704 {
    
    public void printJulyCalendar() {
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.MONTH, Calendar.JULY);
        cal.set(Calendar.DAY_OF_MONTH, 1);

        int daysInMonth = cal.getActualMaximum(Calendar.DAY_OF_MONTH);

     

        int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK) - 1; // 0부터 시작하도록 조정
        for (int i = 0; i < dayOfWeek; i++) {
            System.out.print( "     ");
        }

        for (int day = 1; day <= daysInMonth; day++) {
            System.out.printf("%3d ", day);

            if ((day + dayOfWeek) % 7 == 0) {
                System.out.println();
            }
        }
    }
    
//    
//    public String [][] printYearMonth(int year, int month) {
//    	
//        Calendar cal = Calendar.getInstance();
//        cal.set(Calendar.YEAR, year);
//        cal.set(Calendar.MONTH, month)
//        ;
//    	
//    	
//    	String[][] result;
//		return result;
//    	
//
//    }
    
    
    

    
    
    
    

    public static void main(String[] args) {
    	
        Work0704 w = new Work0704();
        w.printJulyCalendar();
    }
}
