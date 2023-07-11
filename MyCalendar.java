package day0711;

import java.awt.Color;
import java.awt.GridLayout;
import java.util.Calendar;
import javax.swing.JFrame;
import javax.swing.JLabel;

@SuppressWarnings("serial")
public class MyCalendar extends JFrame{
	
	private Calendar cal;
	private JLabel jlblDate[];
	
	public MyCalendar(int year, int month) {
		super("Calendar");
		cal = Calendar.getInstance();
		jlblDate = new JLabel[7];
		
		setLayout(new GridLayout(0, 7));
		
		displayWeekDays();
		displayDays(setYearMonth(year, month));
		
		setSize(500, 500);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	
	public void displayWeekDays() {
		char[] weeks = {'일','월','화','수','목','금','토'};
		for(int i = 0; i < weeks.length; i++) {
			jlblDate[i] = new JLabel(String.valueOf(weeks[i]), JLabel.CENTER);
			if(i == 0) {
				jlblDate[i].setForeground(Color.RED);
			}
			if(i == 6) {
				jlblDate[i].setForeground(Color.BLUE);
			}
			add(jlblDate[i]);
		}
	}
	
	public void displayDays(JLabel[][] calendar) {
		for(int i = 0; i < calendar.length; i++) {
			for(int j = 0; j < calendar[i].length; j++) {
				add(calendar[i][j]);
			}
		}
	}
	
	
	public JLabel[][] setYearMonth(int year, int month) {
		cal.set(year, month - 1, 1);
		int day = 1;
		int temp=0;
		temp=cal.getActualMaximum(Calendar.WEEK_OF_MONTH);
		JLabel[][] jblbCalendar = new JLabel[temp][7];
		
		String[] weekTitle="일요일,월요일,화요일,수요일,목요일,금요일,토요일".split(",");

		for (int i = 0; i < cal.getActualMaximum(Calendar.WEEK_OF_MONTH); i++) {
			for (int j = 0; j < 7; j++) {
				if (i == 0 && cal.get(Calendar.DAY_OF_WEEK) > j + 1) {
					jblbCalendar[i][j] = new JLabel();
				} else if (day > cal.getActualMaximum(Calendar.DAY_OF_MONTH)) {
					jblbCalendar[i][j] = new JLabel();

				} else {
					jblbCalendar[i][j] = new JLabel(String.valueOf(day), JLabel.CENTER);
					day++;
				} // end else
				
				//일요일은 빨간 색, 토요일은 파란색으로 표시
				if(j == 0) {
					jblbCalendar[i][j].setForeground(Color.RED);
				} else if( j == 6) {
					jblbCalendar[i][j].setForeground(Color.BLUE);
				}
				jblbCalendar[i][j].setToolTipText(weekTitle[j]);
				
			} // end for
		} // end for
		return jblbCalendar;
	}// end yearMonth
	
}
