import java.awt.event.MouseEvent;

import acm.graphics.*;
import acm.program.GraphicsProgram;

//ტეხილის სათავე დაფიქსირებულია და მდებარეობს (0,0) წერტილში.მაუსის
//ყოველ კლიკზე დაფაზე უნდა დაემატოს ახალი GLine რომლის ერთი წვერო არის
//ტეხილის ბოლო წერტილი, ხოლო მეორე წვერო კი, წერტილი სადაც მოხდა მაუსის
//კლიკი. მაგალითად თუ მომხმარებელმა პირველად დააკლიკა (10, 100) წერტილზე, მაშინ თქვენმა პროგრამამ დაფაზე უნდა დაამატოს (0, 0) წერტილიდან (10, 100)
//წერტილამდე მონაკვეთი. ხოლო თუ მეორე დაჭერისას მომხმარებელმა
//დააკლიკა (5, 5) წერტილზე, დაფაზე უნდა დაემატოს (10, 100) წერტილიდან (5, 5)
//წერტილამდე მონაკვეთი. ყოველი მაუსის გაჩოჩებისას(mouseDragged) პროგრამა უნდა ხატავდეს
//მონაკვეთის მოძრაობას, რომლის ერთი ბოლო დაფიქსირებულია ტეხილის ბოლო
//წერტილში, ხოლო მეორე ბოლო დაყვება მაუსის ისარს. ისევე როგორც ეს ხდება
//პროგრამაში Paint. ამოხსნა დაწერეთ zigzag.java

public class Zigzag extends GraphicsProgram{
		private GPoint prevPoint;
		private GLine line;
		public void run(){
			addMouseListeners();
			prevPoint = new GPoint(0, 0);
		}
		
		public void mousePressed(MouseEvent e){
			line = new GLine(prevPoint.getX(), prevPoint.getY(),
					e.getX(), e.getY());
			add(line);
			prevPoint = new GPoint(e.getX(), e.getY());
		}
		
		public void mouseDragged(MouseEvent e){
			line.setEndPoint(e.getX(), e.getY());
			prevPoint = new GPoint(e.getX(), e.getY());
		}
		
	}
		// we don't need mouseClicked anymore, same happens in mousePressed
//		public void mouseClicked(MouseEvent e){
//			line = new GLine(prevPoint.getX(), prevPoint.getY(),
//					e.getX(), e.getY());
//			add(line);
//			prevPoint = new GPoint(e.getX(), e.getY());
//		}

