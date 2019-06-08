package org.fmgroup.mediator;
import java.util.Random;
public class temp1 { 
int m1_pinDirection;
int m1_pinSpeed;
int m1_speed_value;
Boolean m1_speed_reqRead = false;
Boolean m1_speed_reqWrite = false;
int m2_pinDirection;
int m2_pinSpeed;
int m2_speed_value;
Boolean m2_speed_reqRead = false;
Boolean m2_speed_reqWrite = false;
Boolean c_dist_reqRead = false;
Boolean c_dist_reqWrite = false;
int c_act_value;
Boolean c_act_reqRead = false;
Boolean c_act_reqWrite = false;
long _ultraSonicDist_1_time1 = System.currentTimeMillis();
int _ultraSonicDist_1_time2 = 0;
int pmark = 0;
int c_dist_value;
public void output(int step){
int _step = 0;
while(_step < step){
if (!((!(false) && !(m1_speed_reqRead))||(!(false) && !(m2_speed_reqRead))||(!(false) && !(c_act_reqWrite))||(!(false) && c_act_reqWrite != m1_speed_reqWrite)||(!(false || c_act_reqWrite != m1_speed_reqWrite) && m1_speed_reqRead && m2_speed_reqRead != c_act_reqRead)||(!(false) && !(c_dist_reqWrite))||(!(false || c_act_reqWrite != m1_speed_reqWrite || m1_speed_reqRead && m2_speed_reqRead != c_act_reqRead) && c_act_reqRead && c_act_reqWrite && !(false || !(c_dist_reqWrite)) && c_dist_reqRead || _ultraSonicDist_1_time1 >= 5 && !(false || !(c_act_reqWrite)) && c_act_reqRead && !(false || !(m2_speed_reqRead)) && m2_speed_reqRead && m2_speed_reqWrite && !(false || !(m1_speed_reqRead)) && m1_speed_reqRead && m1_speed_reqWrite))) {
System.out.println("deadlock!");
break;}
Random r = new Random();
pmark = r.nextInt(7);
if ((pmark == 0)&&(!(false) && !(m1_speed_reqRead))){m1_speed_reqRead = true;
_step += 1;
}
if ((pmark == 1)&&(!(false) && !(m2_speed_reqRead))){m2_speed_reqRead = true;
_step += 1;
}
if ((pmark == 2)&&(!(false) && !(c_act_reqWrite))){c_act_reqWrite = true;
_step += 1;
}
if ((pmark == 3)&&(!(false) && c_act_reqWrite != m1_speed_reqWrite)){m1_speed_reqWrite = c_act_reqWrite;
m2_speed_reqWrite = c_act_reqWrite;
_step += 1;
}
if ((pmark == 4)&&(!(false || c_act_reqWrite != m1_speed_reqWrite) && m1_speed_reqRead && m2_speed_reqRead != c_act_reqRead)){c_act_reqRead = m1_speed_reqRead & m2_speed_reqRead;
_step += 1;
}
if ((pmark == 5)&&(!(false) && !(c_dist_reqWrite))){c_dist_reqWrite = true;
_step += 1;
}
if ((pmark == 6)&&(!(false || c_act_reqWrite != m1_speed_reqWrite || m1_speed_reqRead && m2_speed_reqRead != c_act_reqRead) && c_act_reqRead && c_act_reqWrite && !(false || !(c_dist_reqWrite)) && c_dist_reqRead || _ultraSonicDist_1_time1 >= 5 && !(false || !(c_act_reqWrite)) && c_act_reqRead && !(false || !(m2_speed_reqRead)) && m2_speed_reqRead && m2_speed_reqWrite && !(false || !(m1_speed_reqRead)) && m1_speed_reqRead && m1_speed_reqWrite)){c_dist_reqWrite = false;
c_dist_reqRead = false;
_ultraSonicDist_1_time1 = System.currentTimeMillis();
_ultraSonicDist_1_time2 ++ ;
if (c_dist_value < 10) c_act_value = 0;
c_act_reqWrite = false;
c_act_reqRead = false;
if (c_act_value == 1) {
	m1_speed_value = 80;
	m2_speed_value = 80;
}
else if (c_act_value == -1) {
	m1_speed_value = -80;
	m2_speed_value = -80;
}
else if (c_act_value == 0) {
	m1_speed_value = 0;
	m2_speed_value = 0;
}


m1_speed_reqWrite = false;
m1_speed_reqRead = false;
if (m1_speed_value > 0) {
	m1_pinDirection = 1;
	m1_pinSpeed = m1_speed_value;
}
else {
	m1_pinDirection = 0;
	m1_pinSpeed = -m1_speed_value;
}
m2_speed_reqWrite = false;
m2_speed_reqRead = false;
if (m2_speed_value > 0) {
	m2_pinDirection = 1;
	m2_pinSpeed = m2_speed_value;
}
else {
	m2_pinDirection = 0;
	m2_pinSpeed = -m2_speed_value;
}
_step += 1;
}
}
if (((Object) m1_pinDirection instanceof Integer)||((Object) m1_pinDirection instanceof Boolean)) {
System.out.print("m1_pinDirection: ");
System.out.println(m1_pinDirection);
}
if (((Object) m1_pinSpeed instanceof Integer)||((Object) m1_pinSpeed instanceof Boolean)) {
System.out.print("m1_pinSpeed: ");
System.out.println(m1_pinSpeed);
}
if (((Object) m1_speed_value instanceof Integer)||((Object) m1_speed_value instanceof Boolean)) {
System.out.print("m1_speed_value: ");
System.out.println(m1_speed_value);
}
if (((Object) m1_speed_reqRead instanceof Integer)||((Object) m1_speed_reqRead instanceof Boolean)) {
System.out.print("m1_speed_reqRead: ");
System.out.println(m1_speed_reqRead);
}
if (((Object) m1_speed_reqWrite instanceof Integer)||((Object) m1_speed_reqWrite instanceof Boolean)) {
System.out.print("m1_speed_reqWrite: ");
System.out.println(m1_speed_reqWrite);
}
if (((Object) m2_pinDirection instanceof Integer)||((Object) m2_pinDirection instanceof Boolean)) {
System.out.print("m2_pinDirection: ");
System.out.println(m2_pinDirection);
}
if (((Object) m2_pinSpeed instanceof Integer)||((Object) m2_pinSpeed instanceof Boolean)) {
System.out.print("m2_pinSpeed: ");
System.out.println(m2_pinSpeed);
}
if (((Object) m2_speed_value instanceof Integer)||((Object) m2_speed_value instanceof Boolean)) {
System.out.print("m2_speed_value: ");
System.out.println(m2_speed_value);
}
if (((Object) m2_speed_reqRead instanceof Integer)||((Object) m2_speed_reqRead instanceof Boolean)) {
System.out.print("m2_speed_reqRead: ");
System.out.println(m2_speed_reqRead);
}
if (((Object) m2_speed_reqWrite instanceof Integer)||((Object) m2_speed_reqWrite instanceof Boolean)) {
System.out.print("m2_speed_reqWrite: ");
System.out.println(m2_speed_reqWrite);
}
if (((Object) c_dist_reqRead instanceof Integer)||((Object) c_dist_reqRead instanceof Boolean)) {
System.out.print("c_dist_reqRead: ");
System.out.println(c_dist_reqRead);
}
if (((Object) c_dist_reqWrite instanceof Integer)||((Object) c_dist_reqWrite instanceof Boolean)) {
System.out.print("c_dist_reqWrite: ");
System.out.println(c_dist_reqWrite);
}
if (((Object) c_act_value instanceof Integer)||((Object) c_act_value instanceof Boolean)) {
System.out.print("c_act_value: ");
System.out.println(c_act_value);
}
if (((Object) c_act_reqRead instanceof Integer)||((Object) c_act_reqRead instanceof Boolean)) {
System.out.print("c_act_reqRead: ");
System.out.println(c_act_reqRead);
}
if (((Object) c_act_reqWrite instanceof Integer)||((Object) c_act_reqWrite instanceof Boolean)) {
System.out.print("c_act_reqWrite: ");
System.out.println(c_act_reqWrite);
}
if (((Object) _ultraSonicDist_1_time1 instanceof Integer)||((Object) _ultraSonicDist_1_time1 instanceof Boolean)) {
System.out.print("_ultraSonicDist_1_time1: ");
System.out.println(_ultraSonicDist_1_time1);
}
if (((Object) _ultraSonicDist_1_time2 instanceof Integer)||((Object) _ultraSonicDist_1_time2 instanceof Boolean)) {
System.out.print("_ultraSonicDist_1_time2: ");
System.out.println(_ultraSonicDist_1_time2);
}
}
}