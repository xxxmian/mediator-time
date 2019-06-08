package org.fmgroup.mediator;
import java.util.Random;
public class temp { 
int playerDecide1_max = 0;
int playerDecide1_maxPrepared = 0;
int playerDecide1_decidenum = 0;
int playerDecide1_decideMax_value;
Boolean playerDecide1_decideMax_reqRead = false;
Boolean playerDecide1_decideMax_reqWrite = false;
int playerDecide1_decide_value;
Boolean playerDecide1_decide_reqRead = false;
Boolean playerDecide1_decide_reqWrite = false;
int playerDecide2_max = 0;
int playerDecide2_maxPrepared = 0;
int playerDecide2_decidenum = 0;
int playerDecide2_decideMax_value;
Boolean playerDecide2_decideMax_reqRead = false;
Boolean playerDecide2_decideMax_reqWrite = false;
int playerDecide2_decide_value;
Boolean playerDecide2_decide_reqRead = false;
Boolean playerDecide2_decide_reqWrite = false;
int Contract_player1Played = 0;
int Contract_player2Played = 0;
int Contract_gameFinished = 0;
int Contract_player1Deposit = 0;
int Contract_player2Deposit = 0;
int Contract_gains = 0;
int Contract__test_ = 0;
int Contract_Deposit1_value;
Boolean Contract_Deposit1_reqRead = false;
Boolean Contract_Deposit1_reqWrite = false;
int Contract_Deposit2_value;
Boolean Contract_Deposit2_reqRead = false;
Boolean Contract_Deposit2_reqWrite = false;
int Contract_withDraw1_value;
Boolean Contract_withDraw1_reqRead = false;
Boolean Contract_withDraw1_reqWrite = false;
int Contract_withDraw2_value;
Boolean Contract_withDraw2_reqRead = false;
Boolean Contract_withDraw2_reqWrite = false;
int Contract_turnEnd1_value;
Boolean Contract_turnEnd1_reqRead = false;
Boolean Contract_turnEnd1_reqWrite = false;
int Contract_turnEnd2_value;
Boolean Contract_turnEnd2_reqRead = false;
Boolean Contract_turnEnd2_reqWrite = false;
int _Player_0_capital = 0;
int _Player_0_decideNum = 0;
int _Player_0_initial = 1;
int _Player_0_depositPrepared = 0;
int _Player_1_capital = 0;
int _Player_1_decideNum = 0;
int _Player_1_initial = 1;
int _Player_1_depositPrepared = 0;
int pmark = 0;
public void output(int step){
int _step = 0;
while(_step < step){
if (!((!(false) && playerDecide1_decide_reqRead == false && playerDecide1_decide_reqWrite == false && playerDecide1_decideMax_reqRead == false && playerDecide1_decideMax_reqWrite == true)||(!(false || playerDecide1_decide_reqRead == false && playerDecide1_decide_reqWrite == false && playerDecide1_decideMax_reqRead == false && playerDecide1_decideMax_reqWrite == true || playerDecide1_decideMax_reqRead && playerDecide1_decideMax_reqWrite) && playerDecide1_maxPrepared == 1 && playerDecide1_decidenum < playerDecide1_max)||(!(false || playerDecide1_decide_reqRead == false && playerDecide1_decide_reqWrite == false && playerDecide1_decideMax_reqRead == false && playerDecide1_decideMax_reqWrite == true || playerDecide1_decideMax_reqRead && playerDecide1_decideMax_reqWrite) && playerDecide1_maxPrepared == 1)||(!(false) && playerDecide2_decide_reqRead == false && playerDecide2_decide_reqWrite == false && playerDecide2_decideMax_reqRead == false && playerDecide2_decideMax_reqWrite == true)||(!(false || playerDecide2_decide_reqRead == false && playerDecide2_decide_reqWrite == false && playerDecide2_decideMax_reqRead == false && playerDecide2_decideMax_reqWrite == true || playerDecide2_decideMax_reqRead && playerDecide2_decideMax_reqWrite) && playerDecide2_maxPrepared == 1 && playerDecide2_decidenum < playerDecide2_max)||(!(false || playerDecide2_decide_reqRead == false && playerDecide2_decide_reqWrite == false && playerDecide2_decideMax_reqRead == false && playerDecide2_decideMax_reqWrite == true || playerDecide2_decideMax_reqRead && playerDecide2_decideMax_reqWrite) && playerDecide2_maxPrepared == 1)||(!(false) && !(Contract_Deposit1_reqRead) && Contract_player1Played == 0 && Contract_gameFinished == 0)||(!(false || !(Contract_Deposit1_reqRead) && Contract_player1Played == 0 && Contract_gameFinished == 0) && !(Contract_Deposit2_reqRead) && Contract_player2Played == 0 && Contract_gameFinished == 0)||(!(false || !(Contract_Deposit1_reqRead) && Contract_player1Played == 0 && Contract_gameFinished == 0 || !(Contract_Deposit2_reqRead) && Contract_player2Played == 0 && Contract_gameFinished == 0 || Contract_Deposit1_reqRead && Contract_Deposit1_reqWrite && Contract_gameFinished == 0 || Contract_Deposit2_reqRead && Contract_Deposit2_reqWrite && Contract_gameFinished == 0) && Contract_player1Played == 1 && Contract_player2Played == 1 && Contract_gameFinished == 0)||(!(false) && _Player_0_initial == 1)||(!(false || _Player_0_initial == 1 || playerDecide1_decide_reqRead == false && playerDecide1_decide_reqWrite == false && playerDecide1_decideMax_reqWrite == true && playerDecide1_decideMax_reqRead == true || playerDecide1_decide_reqRead == true && playerDecide1_decide_reqWrite == true) && _Player_0_depositPrepared == 1)||(!(false) && _Player_1_initial == 1)||(!(false || _Player_1_initial == 1 || playerDecide2_decide_reqRead == false && playerDecide2_decide_reqWrite == false && playerDecide2_decideMax_reqWrite == true && playerDecide2_decideMax_reqRead == true || playerDecide2_decide_reqRead == true && playerDecide2_decide_reqWrite == true) && _Player_1_depositPrepared == 1)||(!(false || playerDecide1_decide_reqRead == false && playerDecide1_decide_reqWrite == false && playerDecide1_decideMax_reqRead == false && playerDecide1_decideMax_reqWrite == true) && playerDecide1_decideMax_reqRead && playerDecide1_decideMax_reqWrite && !(false || _Player_0_initial == 1) && playerDecide1_decide_reqRead == false && playerDecide1_decide_reqWrite == false && playerDecide1_decideMax_reqWrite == true && playerDecide1_decideMax_reqRead == true)||(!(false || playerDecide1_decide_reqRead == false && playerDecide1_decide_reqWrite == false && playerDecide1_decideMax_reqRead == false && playerDecide1_decideMax_reqWrite == true || playerDecide1_decideMax_reqRead && playerDecide1_decideMax_reqWrite || playerDecide1_maxPrepared == 1 && playerDecide1_decidenum < playerDecide1_max || playerDecide1_maxPrepared == 1) && playerDecide1_decide_reqWrite && playerDecide1_decide_reqRead && !(false || _Player_0_initial == 1 || playerDecide1_decide_reqRead == false && playerDecide1_decide_reqWrite == false && playerDecide1_decideMax_reqWrite == true && playerDecide1_decideMax_reqRead == true) && playerDecide1_decide_reqRead == true && playerDecide1_decide_reqWrite == true)||(!(false || !(Contract_Deposit1_reqRead) && Contract_player1Played == 0 && Contract_gameFinished == 0 || !(Contract_Deposit2_reqRead) && Contract_player2Played == 0 && Contract_gameFinished == 0) && Contract_Deposit1_reqRead && Contract_Deposit1_reqWrite && Contract_gameFinished == 0 && !(false || _Player_0_initial == 1 || playerDecide1_decide_reqRead == false && playerDecide1_decide_reqWrite == false && playerDecide1_decideMax_reqWrite == true && playerDecide1_decideMax_reqRead == true || playerDecide1_decide_reqRead == true && playerDecide1_decide_reqWrite == true || _Player_0_depositPrepared == 1) && Contract_Deposit1_reqRead == true && Contract_Deposit1_reqWrite == true)||(!(false || playerDecide2_decide_reqRead == false && playerDecide2_decide_reqWrite == false && playerDecide2_decideMax_reqRead == false && playerDecide2_decideMax_reqWrite == true) && playerDecide2_decideMax_reqRead && playerDecide2_decideMax_reqWrite && !(false || _Player_1_initial == 1) && playerDecide2_decide_reqRead == false && playerDecide2_decide_reqWrite == false && playerDecide2_decideMax_reqWrite == true && playerDecide2_decideMax_reqRead == true)||(!(false || playerDecide2_decide_reqRead == false && playerDecide2_decide_reqWrite == false && playerDecide2_decideMax_reqRead == false && playerDecide2_decideMax_reqWrite == true) && playerDecide2_decideMax_reqRead && playerDecide2_decideMax_reqWrite && !(false || playerDecide1_decide_reqRead == false && playerDecide1_decide_reqWrite == false && playerDecide1_decideMax_reqRead == false && playerDecide1_decideMax_reqWrite == true) && playerDecide1_decideMax_reqRead && playerDecide1_decideMax_reqWrite && !(false || _Player_1_initial == 1) && playerDecide2_decide_reqRead == false && playerDecide2_decide_reqWrite == false && playerDecide2_decideMax_reqWrite == true && playerDecide2_decideMax_reqRead == true && !(false || _Player_0_initial == 1) && playerDecide1_decide_reqRead == false && playerDecide1_decide_reqWrite == false && playerDecide1_decideMax_reqWrite == true && playerDecide1_decideMax_reqRead == true)||(!(false || playerDecide2_decide_reqRead == false && playerDecide2_decide_reqWrite == false && playerDecide2_decideMax_reqRead == false && playerDecide2_decideMax_reqWrite == true) && playerDecide2_decideMax_reqRead && playerDecide2_decideMax_reqWrite && !(false || playerDecide1_decide_reqRead == false && playerDecide1_decide_reqWrite == false && playerDecide1_decideMax_reqRead == false && playerDecide1_decideMax_reqWrite == true || playerDecide1_decideMax_reqRead && playerDecide1_decideMax_reqWrite || playerDecide1_maxPrepared == 1 && playerDecide1_decidenum < playerDecide1_max || playerDecide1_maxPrepared == 1) && playerDecide1_decide_reqWrite && playerDecide1_decide_reqRead && !(false || _Player_1_initial == 1) && playerDecide2_decide_reqRead == false && playerDecide2_decide_reqWrite == false && playerDecide2_decideMax_reqWrite == true && playerDecide2_decideMax_reqRead == true && !(false || _Player_0_initial == 1 || playerDecide1_decide_reqRead == false && playerDecide1_decide_reqWrite == false && playerDecide1_decideMax_reqWrite == true && playerDecide1_decideMax_reqRead == true) && playerDecide1_decide_reqRead == true && playerDecide1_decide_reqWrite == true)||(!(false || playerDecide2_decide_reqRead == false && playerDecide2_decide_reqWrite == false && playerDecide2_decideMax_reqRead == false && playerDecide2_decideMax_reqWrite == true) && playerDecide2_decideMax_reqRead && playerDecide2_decideMax_reqWrite && !(false || !(Contract_Deposit1_reqRead) && Contract_player1Played == 0 && Contract_gameFinished == 0 || !(Contract_Deposit2_reqRead) && Contract_player2Played == 0 && Contract_gameFinished == 0) && Contract_Deposit1_reqRead && Contract_Deposit1_reqWrite && Contract_gameFinished == 0 && !(false || _Player_1_initial == 1) && playerDecide2_decide_reqRead == false && playerDecide2_decide_reqWrite == false && playerDecide2_decideMax_reqWrite == true && playerDecide2_decideMax_reqRead == true && !(false || _Player_0_initial == 1 || playerDecide1_decide_reqRead == false && playerDecide1_decide_reqWrite == false && playerDecide1_decideMax_reqWrite == true && playerDecide1_decideMax_reqRead == true || playerDecide1_decide_reqRead == true && playerDecide1_decide_reqWrite == true || _Player_0_depositPrepared == 1) && Contract_Deposit1_reqRead == true && Contract_Deposit1_reqWrite == true)||(!(false || playerDecide2_decide_reqRead == false && playerDecide2_decide_reqWrite == false && playerDecide2_decideMax_reqRead == false && playerDecide2_decideMax_reqWrite == true || playerDecide2_decideMax_reqRead && playerDecide2_decideMax_reqWrite || playerDecide2_maxPrepared == 1 && playerDecide2_decidenum < playerDecide2_max || playerDecide2_maxPrepared == 1) && playerDecide2_decide_reqWrite && playerDecide2_decide_reqRead && !(false || _Player_1_initial == 1 || playerDecide2_decide_reqRead == false && playerDecide2_decide_reqWrite == false && playerDecide2_decideMax_reqWrite == true && playerDecide2_decideMax_reqRead == true) && playerDecide2_decide_reqRead == true && playerDecide2_decide_reqWrite == true)||(!(false || playerDecide2_decide_reqRead == false && playerDecide2_decide_reqWrite == false && playerDecide2_decideMax_reqRead == false && playerDecide2_decideMax_reqWrite == true || playerDecide2_decideMax_reqRead && playerDecide2_decideMax_reqWrite || playerDecide2_maxPrepared == 1 && playerDecide2_decidenum < playerDecide2_max || playerDecide2_maxPrepared == 1) && playerDecide2_decide_reqWrite && playerDecide2_decide_reqRead && !(false || playerDecide1_decide_reqRead == false && playerDecide1_decide_reqWrite == false && playerDecide1_decideMax_reqRead == false && playerDecide1_decideMax_reqWrite == true) && playerDecide1_decideMax_reqRead && playerDecide1_decideMax_reqWrite && !(false || _Player_1_initial == 1 || playerDecide2_decide_reqRead == false && playerDecide2_decide_reqWrite == false && playerDecide2_decideMax_reqWrite == true && playerDecide2_decideMax_reqRead == true) && playerDecide2_decide_reqRead == true && playerDecide2_decide_reqWrite == true && !(false || _Player_0_initial == 1) && playerDecide1_decide_reqRead == false && playerDecide1_decide_reqWrite == false && playerDecide1_decideMax_reqWrite == true && playerDecide1_decideMax_reqRead == true)||(!(false || playerDecide2_decide_reqRead == false && playerDecide2_decide_reqWrite == false && playerDecide2_decideMax_reqRead == false && playerDecide2_decideMax_reqWrite == true || playerDecide2_decideMax_reqRead && playerDecide2_decideMax_reqWrite || playerDecide2_maxPrepared == 1 && playerDecide2_decidenum < playerDecide2_max || playerDecide2_maxPrepared == 1) && playerDecide2_decide_reqWrite && playerDecide2_decide_reqRead && !(false || playerDecide1_decide_reqRead == false && playerDecide1_decide_reqWrite == false && playerDecide1_decideMax_reqRead == false && playerDecide1_decideMax_reqWrite == true || playerDecide1_decideMax_reqRead && playerDecide1_decideMax_reqWrite || playerDecide1_maxPrepared == 1 && playerDecide1_decidenum < playerDecide1_max || playerDecide1_maxPrepared == 1) && playerDecide1_decide_reqWrite && playerDecide1_decide_reqRead && !(false || _Player_1_initial == 1 || playerDecide2_decide_reqRead == false && playerDecide2_decide_reqWrite == false && playerDecide2_decideMax_reqWrite == true && playerDecide2_decideMax_reqRead == true) && playerDecide2_decide_reqRead == true && playerDecide2_decide_reqWrite == true && !(false || _Player_0_initial == 1 || playerDecide1_decide_reqRead == false && playerDecide1_decide_reqWrite == false && playerDecide1_decideMax_reqWrite == true && playerDecide1_decideMax_reqRead == true) && playerDecide1_decide_reqRead == true && playerDecide1_decide_reqWrite == true)||(!(false || playerDecide2_decide_reqRead == false && playerDecide2_decide_reqWrite == false && playerDecide2_decideMax_reqRead == false && playerDecide2_decideMax_reqWrite == true || playerDecide2_decideMax_reqRead && playerDecide2_decideMax_reqWrite || playerDecide2_maxPrepared == 1 && playerDecide2_decidenum < playerDecide2_max || playerDecide2_maxPrepared == 1) && playerDecide2_decide_reqWrite && playerDecide2_decide_reqRead && !(false || !(Contract_Deposit1_reqRead) && Contract_player1Played == 0 && Contract_gameFinished == 0 || !(Contract_Deposit2_reqRead) && Contract_player2Played == 0 && Contract_gameFinished == 0) && Contract_Deposit1_reqRead && Contract_Deposit1_reqWrite && Contract_gameFinished == 0 && !(false || _Player_1_initial == 1 || playerDecide2_decide_reqRead == false && playerDecide2_decide_reqWrite == false && playerDecide2_decideMax_reqWrite == true && playerDecide2_decideMax_reqRead == true) && playerDecide2_decide_reqRead == true && playerDecide2_decide_reqWrite == true && !(false || _Player_0_initial == 1 || playerDecide1_decide_reqRead == false && playerDecide1_decide_reqWrite == false && playerDecide1_decideMax_reqWrite == true && playerDecide1_decideMax_reqRead == true || playerDecide1_decide_reqRead == true && playerDecide1_decide_reqWrite == true || _Player_0_depositPrepared == 1) && Contract_Deposit1_reqRead == true && Contract_Deposit1_reqWrite == true)||(!(false || !(Contract_Deposit1_reqRead) && Contract_player1Played == 0 && Contract_gameFinished == 0 || !(Contract_Deposit2_reqRead) && Contract_player2Played == 0 && Contract_gameFinished == 0 || Contract_Deposit1_reqRead && Contract_Deposit1_reqWrite && Contract_gameFinished == 0) && Contract_Deposit2_reqRead && Contract_Deposit2_reqWrite && Contract_gameFinished == 0 && !(false || _Player_1_initial == 1 || playerDecide2_decide_reqRead == false && playerDecide2_decide_reqWrite == false && playerDecide2_decideMax_reqWrite == true && playerDecide2_decideMax_reqRead == true || playerDecide2_decide_reqRead == true && playerDecide2_decide_reqWrite == true || _Player_1_depositPrepared == 1) && Contract_Deposit2_reqRead == true && Contract_Deposit2_reqWrite == true)||(!(false || !(Contract_Deposit1_reqRead) && Contract_player1Played == 0 && Contract_gameFinished == 0 || !(Contract_Deposit2_reqRead) && Contract_player2Played == 0 && Contract_gameFinished == 0 || Contract_Deposit1_reqRead && Contract_Deposit1_reqWrite && Contract_gameFinished == 0) && Contract_Deposit2_reqRead && Contract_Deposit2_reqWrite && Contract_gameFinished == 0 && !(false || playerDecide1_decide_reqRead == false && playerDecide1_decide_reqWrite == false && playerDecide1_decideMax_reqRead == false && playerDecide1_decideMax_reqWrite == true) && playerDecide1_decideMax_reqRead && playerDecide1_decideMax_reqWrite && !(false || _Player_1_initial == 1 || playerDecide2_decide_reqRead == false && playerDecide2_decide_reqWrite == false && playerDecide2_decideMax_reqWrite == true && playerDecide2_decideMax_reqRead == true || playerDecide2_decide_reqRead == true && playerDecide2_decide_reqWrite == true || _Player_1_depositPrepared == 1) && Contract_Deposit2_reqRead == true && Contract_Deposit2_reqWrite == true && !(false || _Player_0_initial == 1) && playerDecide1_decide_reqRead == false && playerDecide1_decide_reqWrite == false && playerDecide1_decideMax_reqWrite == true && playerDecide1_decideMax_reqRead == true)||(!(false || !(Contract_Deposit1_reqRead) && Contract_player1Played == 0 && Contract_gameFinished == 0 || !(Contract_Deposit2_reqRead) && Contract_player2Played == 0 && Contract_gameFinished == 0 || Contract_Deposit1_reqRead && Contract_Deposit1_reqWrite && Contract_gameFinished == 0) && Contract_Deposit2_reqRead && Contract_Deposit2_reqWrite && Contract_gameFinished == 0 && !(false || playerDecide1_decide_reqRead == false && playerDecide1_decide_reqWrite == false && playerDecide1_decideMax_reqRead == false && playerDecide1_decideMax_reqWrite == true || playerDecide1_decideMax_reqRead && playerDecide1_decideMax_reqWrite || playerDecide1_maxPrepared == 1 && playerDecide1_decidenum < playerDecide1_max || playerDecide1_maxPrepared == 1) && playerDecide1_decide_reqWrite && playerDecide1_decide_reqRead && !(false || _Player_1_initial == 1 || playerDecide2_decide_reqRead == false && playerDecide2_decide_reqWrite == false && playerDecide2_decideMax_reqWrite == true && playerDecide2_decideMax_reqRead == true || playerDecide2_decide_reqRead == true && playerDecide2_decide_reqWrite == true || _Player_1_depositPrepared == 1) && Contract_Deposit2_reqRead == true && Contract_Deposit2_reqWrite == true && !(false || _Player_0_initial == 1 || playerDecide1_decide_reqRead == false && playerDecide1_decide_reqWrite == false && playerDecide1_decideMax_reqWrite == true && playerDecide1_decideMax_reqRead == true) && playerDecide1_decide_reqRead == true && playerDecide1_decide_reqWrite == true)||(!(false || !(Contract_Deposit1_reqRead) && Contract_player1Played == 0 && Contract_gameFinished == 0 || !(Contract_Deposit2_reqRead) && Contract_player2Played == 0 && Contract_gameFinished == 0 || Contract_Deposit1_reqRead && Contract_Deposit1_reqWrite && Contract_gameFinished == 0 || Contract_Deposit2_reqRead && Contract_Deposit2_reqWrite && Contract_gameFinished == 0 || Contract_player1Played == 1 && Contract_player2Played == 1 && Contract_gameFinished == 0) && Contract_turnEnd1_reqRead && Contract_turnEnd1_reqWrite && Contract_turnEnd2_reqRead && Contract_turnEnd2_reqWrite && !(false || _Player_1_initial == 1 || playerDecide2_decide_reqRead == false && playerDecide2_decide_reqWrite == false && playerDecide2_decideMax_reqWrite == true && playerDecide2_decideMax_reqRead == true || playerDecide2_decide_reqRead == true && playerDecide2_decide_reqWrite == true || _Player_1_depositPrepared == 1 || Contract_Deposit2_reqRead == true && Contract_Deposit2_reqWrite == true) && Contract_turnEnd2_reqWrite == true && Contract_turnEnd2_reqRead == true && !(false || _Player_0_initial == 1 || playerDecide1_decide_reqRead == false && playerDecide1_decide_reqWrite == false && playerDecide1_decideMax_reqWrite == true && playerDecide1_decideMax_reqRead == true || playerDecide1_decide_reqRead == true && playerDecide1_decide_reqWrite == true || _Player_0_depositPrepared == 1 || Contract_Deposit1_reqRead == true && Contract_Deposit1_reqWrite == true) && Contract_turnEnd1_reqWrite == true && Contract_turnEnd1_reqRead == true)||(!(false || !(Contract_Deposit1_reqRead) && Contract_player1Played == 0 && Contract_gameFinished == 0 || !(Contract_Deposit2_reqRead) && Contract_player2Played == 0 && Contract_gameFinished == 0 || Contract_Deposit1_reqRead && Contract_Deposit1_reqWrite && Contract_gameFinished == 0 || Contract_Deposit2_reqRead && Contract_Deposit2_reqWrite && Contract_gameFinished == 0 || Contract_player1Played == 1 && Contract_player2Played == 1 && Contract_gameFinished == 0 || Contract_turnEnd1_reqRead && Contract_turnEnd1_reqWrite && Contract_turnEnd2_reqRead && Contract_turnEnd2_reqWrite) && Contract_withDraw1_reqRead && Contract_withDraw1_reqWrite && Contract_withDraw2_reqRead && Contract_withDraw2_reqWrite && !(false || _Player_1_initial == 1 || playerDecide2_decide_reqRead == false && playerDecide2_decide_reqWrite == false && playerDecide2_decideMax_reqWrite == true && playerDecide2_decideMax_reqRead == true || playerDecide2_decide_reqRead == true && playerDecide2_decide_reqWrite == true || _Player_1_depositPrepared == 1 || Contract_Deposit2_reqRead == true && Contract_Deposit2_reqWrite == true || Contract_turnEnd2_reqWrite == true && Contract_turnEnd2_reqRead == true) && Contract_withDraw2_reqRead == true && Contract_withDraw2_reqWrite == true && !(false || _Player_0_initial == 1 || playerDecide1_decide_reqRead == false && playerDecide1_decide_reqWrite == false && playerDecide1_decideMax_reqWrite == true && playerDecide1_decideMax_reqRead == true || playerDecide1_decide_reqRead == true && playerDecide1_decide_reqWrite == true || _Player_0_depositPrepared == 1 || Contract_Deposit1_reqRead == true && Contract_Deposit1_reqWrite == true || Contract_turnEnd1_reqWrite == true && Contract_turnEnd1_reqRead == true) && Contract_withDraw1_reqRead == true && Contract_withDraw1_reqWrite == true))) {
System.out.println("deadlock!");
break;}
Random r = new Random();
pmark = r.nextInt(29);
if ((pmark == 0)&&(!(false) && playerDecide1_decide_reqRead == false && playerDecide1_decide_reqWrite == false && playerDecide1_decideMax_reqRead == false && playerDecide1_decideMax_reqWrite == true)){playerDecide1_decideMax_reqRead = true;
_step += 1;
}
if ((pmark == 1)&&(!(false || playerDecide1_decide_reqRead == false && playerDecide1_decide_reqWrite == false && playerDecide1_decideMax_reqRead == false && playerDecide1_decideMax_reqWrite == true || playerDecide1_decideMax_reqRead && playerDecide1_decideMax_reqWrite) && playerDecide1_maxPrepared == 1 && playerDecide1_decidenum < playerDecide1_max)){playerDecide1_decidenum = playerDecide1_decidenum + 1;
_step += 1;
}
if ((pmark == 2)&&(!(false || playerDecide1_decide_reqRead == false && playerDecide1_decide_reqWrite == false && playerDecide1_decideMax_reqRead == false && playerDecide1_decideMax_reqWrite == true || playerDecide1_decideMax_reqRead && playerDecide1_decideMax_reqWrite) && playerDecide1_maxPrepared == 1)){playerDecide1_maxPrepared = 0;
playerDecide1_decide_value = playerDecide1_decidenum;
playerDecide1_decide_reqWrite = true;
_step += 1;
}
if ((pmark == 3)&&(!(false) && playerDecide2_decide_reqRead == false && playerDecide2_decide_reqWrite == false && playerDecide2_decideMax_reqRead == false && playerDecide2_decideMax_reqWrite == true)){playerDecide2_decideMax_reqRead = true;
_step += 1;
}
if ((pmark == 4)&&(!(false || playerDecide2_decide_reqRead == false && playerDecide2_decide_reqWrite == false && playerDecide2_decideMax_reqRead == false && playerDecide2_decideMax_reqWrite == true || playerDecide2_decideMax_reqRead && playerDecide2_decideMax_reqWrite) && playerDecide2_maxPrepared == 1 && playerDecide2_decidenum < playerDecide2_max)){playerDecide2_decidenum = playerDecide2_decidenum + 1;
_step += 1;
}
if ((pmark == 5)&&(!(false || playerDecide2_decide_reqRead == false && playerDecide2_decide_reqWrite == false && playerDecide2_decideMax_reqRead == false && playerDecide2_decideMax_reqWrite == true || playerDecide2_decideMax_reqRead && playerDecide2_decideMax_reqWrite) && playerDecide2_maxPrepared == 1)){playerDecide2_maxPrepared = 0;
playerDecide2_decide_value = playerDecide2_decidenum;
playerDecide2_decide_reqWrite = true;
_step += 1;
}
if ((pmark == 6)&&(!(false) && !(Contract_Deposit1_reqRead) && Contract_player1Played == 0 && Contract_gameFinished == 0)){Contract_Deposit1_reqRead = true;
_step += 1;
}
if ((pmark == 7)&&(!(false || !(Contract_Deposit1_reqRead) && Contract_player1Played == 0 && Contract_gameFinished == 0) && !(Contract_Deposit2_reqRead) && Contract_player2Played == 0 && Contract_gameFinished == 0)){Contract_Deposit2_reqRead = true;
_step += 1;
}
if ((pmark == 8)&&(!(false || !(Contract_Deposit1_reqRead) && Contract_player1Played == 0 && Contract_gameFinished == 0 || !(Contract_Deposit2_reqRead) && Contract_player2Played == 0 && Contract_gameFinished == 0 || Contract_Deposit1_reqRead && Contract_Deposit1_reqWrite && Contract_gameFinished == 0 || Contract_Deposit2_reqRead && Contract_Deposit2_reqWrite && Contract_gameFinished == 0) && Contract_player1Played == 1 && Contract_player2Played == 1 && Contract_gameFinished == 0)){if (Contract_player1Deposit > Contract_player2Deposit * 2 && Contract_player1Played == 1 && Contract_player2Played == 1) {
	Contract_player1Played = 0;
	Contract_player2Played = 0;
	Contract_gains = Contract_player1Deposit + Contract_player2Deposit;
	Contract_player1Deposit = 0;
	Contract_player2Deposit = 0;
	Contract_withDraw1_reqWrite = true;
	Contract_withDraw2_reqWrite = true;
	Contract_withDraw1_value = Contract_gains;
	Contract_withDraw2_value = 0;
	Contract_gameFinished = 1;
}
if (Contract_player2Deposit > Contract_player1Deposit * 2 && Contract_player1Played == 1 && Contract_player2Played == 1) {
	Contract_player1Played = 0;
	Contract_player2Played = 0;
	Contract_gains = Contract_player1Deposit + Contract_player2Deposit;
	Contract_player1Deposit = 0;
	Contract_player2Deposit = 0;
	Contract_withDraw1_reqWrite = true;
	Contract_withDraw2_reqWrite = true;
	Contract_withDraw2_value = Contract_gains;
	Contract_withDraw1_value = 0;
	Contract_gameFinished = 1;
}
if (Contract_player1Deposit <= Contract_player2Deposit + 1 * 2 && Contract_player1Deposit <= Contract_player2Deposit * 2 && Contract_player1Played == 1 && Contract_player2Played == 1) {
	Contract_player1Played = 0;
	Contract_player2Played = 0;
	Contract_turnEnd1_reqWrite = true;
	Contract_turnEnd2_reqWrite = true;
}
_step += 1;
}
if ((pmark == 9)&&(!(false) && _Player_0_initial == 1)){_Player_0_capital = 10;
_Player_0_initial = 0;
playerDecide1_decideMax_reqWrite = true;
Contract_withDraw1_reqRead = true;
_step += 1;
}
if ((pmark == 10)&&(!(false || _Player_0_initial == 1 || playerDecide1_decide_reqRead == false && playerDecide1_decide_reqWrite == false && playerDecide1_decideMax_reqWrite == true && playerDecide1_decideMax_reqRead == true || playerDecide1_decide_reqRead == true && playerDecide1_decide_reqWrite == true) && _Player_0_depositPrepared == 1)){_Player_0_depositPrepared = 0;
Contract_Deposit1_value = _Player_0_decideNum;
_Player_0_capital = _Player_0_capital - _Player_0_decideNum;
Contract_turnEnd1_reqRead = true;
Contract_Deposit1_reqWrite = true;
_step += 1;
}
if ((pmark == 11)&&(!(false) && _Player_1_initial == 1)){_Player_1_capital = 10;
_Player_1_initial = 0;
playerDecide2_decideMax_reqWrite = true;
Contract_withDraw2_reqRead = true;
_step += 1;
}
if ((pmark == 12)&&(!(false || _Player_1_initial == 1 || playerDecide2_decide_reqRead == false && playerDecide2_decide_reqWrite == false && playerDecide2_decideMax_reqWrite == true && playerDecide2_decideMax_reqRead == true || playerDecide2_decide_reqRead == true && playerDecide2_decide_reqWrite == true) && _Player_1_depositPrepared == 1)){_Player_1_depositPrepared = 0;
Contract_Deposit2_value = _Player_1_decideNum;
_Player_1_capital = _Player_1_capital - _Player_1_decideNum;
Contract_turnEnd2_reqRead = true;
Contract_Deposit2_reqWrite = true;
_step += 1;
}
if ((pmark == 13)&&(!(false || playerDecide1_decide_reqRead == false && playerDecide1_decide_reqWrite == false && playerDecide1_decideMax_reqRead == false && playerDecide1_decideMax_reqWrite == true) && playerDecide1_decideMax_reqRead && playerDecide1_decideMax_reqWrite && !(false || _Player_0_initial == 1) && playerDecide1_decide_reqRead == false && playerDecide1_decide_reqWrite == false && playerDecide1_decideMax_reqWrite == true && playerDecide1_decideMax_reqRead == true)){playerDecide1_decideMax_value = _Player_0_capital;
playerDecide1_decideMax_reqWrite = false;
playerDecide1_decideMax_reqRead = false;
playerDecide1_max = playerDecide1_decideMax_value;
playerDecide1_maxPrepared = 1;
playerDecide1_decide_reqRead = true;
playerDecide1_decidenum = 0;
_step += 1;
}
if ((pmark == 14)&&(!(false || playerDecide1_decide_reqRead == false && playerDecide1_decide_reqWrite == false && playerDecide1_decideMax_reqRead == false && playerDecide1_decideMax_reqWrite == true || playerDecide1_decideMax_reqRead && playerDecide1_decideMax_reqWrite || playerDecide1_maxPrepared == 1 && playerDecide1_decidenum < playerDecide1_max || playerDecide1_maxPrepared == 1) && playerDecide1_decide_reqWrite && playerDecide1_decide_reqRead && !(false || _Player_0_initial == 1 || playerDecide1_decide_reqRead == false && playerDecide1_decide_reqWrite == false && playerDecide1_decideMax_reqWrite == true && playerDecide1_decideMax_reqRead == true) && playerDecide1_decide_reqRead == true && playerDecide1_decide_reqWrite == true)){playerDecide1_decide_reqWrite = false;
playerDecide1_decide_reqRead = false;
_Player_0_decideNum = playerDecide1_decide_value;
_Player_0_depositPrepared = 1;
_step += 1;
}
if ((pmark == 15)&&(!(false || !(Contract_Deposit1_reqRead) && Contract_player1Played == 0 && Contract_gameFinished == 0 || !(Contract_Deposit2_reqRead) && Contract_player2Played == 0 && Contract_gameFinished == 0) && Contract_Deposit1_reqRead && Contract_Deposit1_reqWrite && Contract_gameFinished == 0 && !(false || _Player_0_initial == 1 || playerDecide1_decide_reqRead == false && playerDecide1_decide_reqWrite == false && playerDecide1_decideMax_reqWrite == true && playerDecide1_decideMax_reqRead == true || playerDecide1_decide_reqRead == true && playerDecide1_decide_reqWrite == true || _Player_0_depositPrepared == 1) && Contract_Deposit1_reqRead == true && Contract_Deposit1_reqWrite == true)){Contract_Deposit1_reqWrite = false;
Contract_Deposit1_reqRead = false;
Contract_player1Deposit = Contract_player1Deposit + Contract_Deposit1_value;
Contract_player1Played = 1;
_step += 1;
}
if ((pmark == 16)&&(!(false || playerDecide2_decide_reqRead == false && playerDecide2_decide_reqWrite == false && playerDecide2_decideMax_reqRead == false && playerDecide2_decideMax_reqWrite == true) && playerDecide2_decideMax_reqRead && playerDecide2_decideMax_reqWrite && !(false || _Player_1_initial == 1) && playerDecide2_decide_reqRead == false && playerDecide2_decide_reqWrite == false && playerDecide2_decideMax_reqWrite == true && playerDecide2_decideMax_reqRead == true)){playerDecide2_decideMax_value = _Player_1_capital;
playerDecide2_decideMax_reqWrite = false;
playerDecide2_decideMax_reqRead = false;
playerDecide2_max = playerDecide2_decideMax_value;
playerDecide2_maxPrepared = 1;
playerDecide2_decidenum = 0;
playerDecide2_decide_reqRead = true;
_step += 1;
}
if ((pmark == 17)&&(!(false || playerDecide2_decide_reqRead == false && playerDecide2_decide_reqWrite == false && playerDecide2_decideMax_reqRead == false && playerDecide2_decideMax_reqWrite == true) && playerDecide2_decideMax_reqRead && playerDecide2_decideMax_reqWrite && !(false || playerDecide1_decide_reqRead == false && playerDecide1_decide_reqWrite == false && playerDecide1_decideMax_reqRead == false && playerDecide1_decideMax_reqWrite == true) && playerDecide1_decideMax_reqRead && playerDecide1_decideMax_reqWrite && !(false || _Player_1_initial == 1) && playerDecide2_decide_reqRead == false && playerDecide2_decide_reqWrite == false && playerDecide2_decideMax_reqWrite == true && playerDecide2_decideMax_reqRead == true && !(false || _Player_0_initial == 1) && playerDecide1_decide_reqRead == false && playerDecide1_decide_reqWrite == false && playerDecide1_decideMax_reqWrite == true && playerDecide1_decideMax_reqRead == true)){playerDecide1_decideMax_value = _Player_0_capital;
playerDecide2_decideMax_value = _Player_1_capital;
playerDecide2_decideMax_reqWrite = false;
playerDecide2_decideMax_reqRead = false;
playerDecide2_decide_reqRead = true;
playerDecide2_max = playerDecide2_decideMax_value;
playerDecide2_maxPrepared = 1;
playerDecide2_decidenum = 0;
playerDecide1_decideMax_reqWrite = false;
playerDecide1_decideMax_reqRead = false;
playerDecide1_decide_reqRead = true;
playerDecide1_max = playerDecide1_decideMax_value;
playerDecide1_maxPrepared = 1;
playerDecide1_decidenum = 0;
_step += 1;
}
if ((pmark == 18)&&(!(false || playerDecide2_decide_reqRead == false && playerDecide2_decide_reqWrite == false && playerDecide2_decideMax_reqRead == false && playerDecide2_decideMax_reqWrite == true) && playerDecide2_decideMax_reqRead && playerDecide2_decideMax_reqWrite && !(false || playerDecide1_decide_reqRead == false && playerDecide1_decide_reqWrite == false && playerDecide1_decideMax_reqRead == false && playerDecide1_decideMax_reqWrite == true || playerDecide1_decideMax_reqRead && playerDecide1_decideMax_reqWrite || playerDecide1_maxPrepared == 1 && playerDecide1_decidenum < playerDecide1_max || playerDecide1_maxPrepared == 1) && playerDecide1_decide_reqWrite && playerDecide1_decide_reqRead && !(false || _Player_1_initial == 1) && playerDecide2_decide_reqRead == false && playerDecide2_decide_reqWrite == false && playerDecide2_decideMax_reqWrite == true && playerDecide2_decideMax_reqRead == true && !(false || _Player_0_initial == 1 || playerDecide1_decide_reqRead == false && playerDecide1_decide_reqWrite == false && playerDecide1_decideMax_reqWrite == true && playerDecide1_decideMax_reqRead == true) && playerDecide1_decide_reqRead == true && playerDecide1_decide_reqWrite == true)){playerDecide2_decideMax_value = _Player_1_capital;
playerDecide1_decide_reqWrite = false;
playerDecide1_decide_reqRead = false;
_Player_0_decideNum = playerDecide1_decide_value;
_Player_0_depositPrepared = 1;
playerDecide2_decideMax_reqWrite = false;
playerDecide2_decideMax_reqRead = false;
playerDecide2_decide_reqRead = true;
playerDecide2_max = playerDecide2_decideMax_value;
playerDecide2_maxPrepared = 1;
playerDecide2_decidenum = 0;
_step += 1;
}
if ((pmark == 19)&&(!(false || playerDecide2_decide_reqRead == false && playerDecide2_decide_reqWrite == false && playerDecide2_decideMax_reqRead == false && playerDecide2_decideMax_reqWrite == true) && playerDecide2_decideMax_reqRead && playerDecide2_decideMax_reqWrite && !(false || !(Contract_Deposit1_reqRead) && Contract_player1Played == 0 && Contract_gameFinished == 0 || !(Contract_Deposit2_reqRead) && Contract_player2Played == 0 && Contract_gameFinished == 0) && Contract_Deposit1_reqRead && Contract_Deposit1_reqWrite && Contract_gameFinished == 0 && !(false || _Player_1_initial == 1) && playerDecide2_decide_reqRead == false && playerDecide2_decide_reqWrite == false && playerDecide2_decideMax_reqWrite == true && playerDecide2_decideMax_reqRead == true && !(false || _Player_0_initial == 1 || playerDecide1_decide_reqRead == false && playerDecide1_decide_reqWrite == false && playerDecide1_decideMax_reqWrite == true && playerDecide1_decideMax_reqRead == true || playerDecide1_decide_reqRead == true && playerDecide1_decide_reqWrite == true || _Player_0_depositPrepared == 1) && Contract_Deposit1_reqRead == true && Contract_Deposit1_reqWrite == true)){playerDecide2_decideMax_value = _Player_1_capital;
playerDecide2_decideMax_reqWrite = false;
playerDecide2_decideMax_reqRead = false;
playerDecide2_max = playerDecide2_decideMax_value;
playerDecide2_decide_reqRead = true;
playerDecide2_maxPrepared = 1;
playerDecide2_decidenum = 0;
Contract_Deposit1_reqWrite = false;
Contract_Deposit1_reqRead = false;
Contract_player1Deposit = Contract_player1Deposit + Contract_Deposit1_value;
Contract_player1Played = 1;
_step += 1;
}
if ((pmark == 20)&&(!(false || playerDecide2_decide_reqRead == false && playerDecide2_decide_reqWrite == false && playerDecide2_decideMax_reqRead == false && playerDecide2_decideMax_reqWrite == true || playerDecide2_decideMax_reqRead && playerDecide2_decideMax_reqWrite || playerDecide2_maxPrepared == 1 && playerDecide2_decidenum < playerDecide2_max || playerDecide2_maxPrepared == 1) && playerDecide2_decide_reqWrite && playerDecide2_decide_reqRead && !(false || _Player_1_initial == 1 || playerDecide2_decide_reqRead == false && playerDecide2_decide_reqWrite == false && playerDecide2_decideMax_reqWrite == true && playerDecide2_decideMax_reqRead == true) && playerDecide2_decide_reqRead == true && playerDecide2_decide_reqWrite == true)){playerDecide2_decide_reqWrite = false;
playerDecide2_decide_reqRead = false;
_Player_1_decideNum = playerDecide2_decide_value;
_Player_1_depositPrepared = 1;
_step += 1;
}
if ((pmark == 21)&&(!(false || playerDecide2_decide_reqRead == false && playerDecide2_decide_reqWrite == false && playerDecide2_decideMax_reqRead == false && playerDecide2_decideMax_reqWrite == true || playerDecide2_decideMax_reqRead && playerDecide2_decideMax_reqWrite || playerDecide2_maxPrepared == 1 && playerDecide2_decidenum < playerDecide2_max || playerDecide2_maxPrepared == 1) && playerDecide2_decide_reqWrite && playerDecide2_decide_reqRead && !(false || playerDecide1_decide_reqRead == false && playerDecide1_decide_reqWrite == false && playerDecide1_decideMax_reqRead == false && playerDecide1_decideMax_reqWrite == true) && playerDecide1_decideMax_reqRead && playerDecide1_decideMax_reqWrite && !(false || _Player_1_initial == 1 || playerDecide2_decide_reqRead == false && playerDecide2_decide_reqWrite == false && playerDecide2_decideMax_reqWrite == true && playerDecide2_decideMax_reqRead == true) && playerDecide2_decide_reqRead == true && playerDecide2_decide_reqWrite == true && !(false || _Player_0_initial == 1) && playerDecide1_decide_reqRead == false && playerDecide1_decide_reqWrite == false && playerDecide1_decideMax_reqWrite == true && playerDecide1_decideMax_reqRead == true)){playerDecide2_decide_reqWrite = false;
playerDecide2_decide_reqRead = false;
_Player_1_decideNum = playerDecide2_decide_value;
_Player_1_depositPrepared = 1;
playerDecide1_decideMax_value = _Player_0_capital;
playerDecide1_decideMax_reqWrite = false;
playerDecide1_decideMax_reqRead = false;
playerDecide1_max = playerDecide1_decideMax_value;
playerDecide1_decide_reqRead = true;
playerDecide1_maxPrepared = 1;
playerDecide1_decidenum = 0;
_step += 1;
}
if ((pmark == 22)&&(!(false || playerDecide2_decide_reqRead == false && playerDecide2_decide_reqWrite == false && playerDecide2_decideMax_reqRead == false && playerDecide2_decideMax_reqWrite == true || playerDecide2_decideMax_reqRead && playerDecide2_decideMax_reqWrite || playerDecide2_maxPrepared == 1 && playerDecide2_decidenum < playerDecide2_max || playerDecide2_maxPrepared == 1) && playerDecide2_decide_reqWrite && playerDecide2_decide_reqRead && !(false || playerDecide1_decide_reqRead == false && playerDecide1_decide_reqWrite == false && playerDecide1_decideMax_reqRead == false && playerDecide1_decideMax_reqWrite == true || playerDecide1_decideMax_reqRead && playerDecide1_decideMax_reqWrite || playerDecide1_maxPrepared == 1 && playerDecide1_decidenum < playerDecide1_max || playerDecide1_maxPrepared == 1) && playerDecide1_decide_reqWrite && playerDecide1_decide_reqRead && !(false || _Player_1_initial == 1 || playerDecide2_decide_reqRead == false && playerDecide2_decide_reqWrite == false && playerDecide2_decideMax_reqWrite == true && playerDecide2_decideMax_reqRead == true) && playerDecide2_decide_reqRead == true && playerDecide2_decide_reqWrite == true && !(false || _Player_0_initial == 1 || playerDecide1_decide_reqRead == false && playerDecide1_decide_reqWrite == false && playerDecide1_decideMax_reqWrite == true && playerDecide1_decideMax_reqRead == true) && playerDecide1_decide_reqRead == true && playerDecide1_decide_reqWrite == true)){playerDecide1_decide_reqWrite = false;
playerDecide1_decide_reqRead = false;
_Player_0_decideNum = playerDecide1_decide_value;
_Player_0_depositPrepared = 1;
playerDecide2_decide_reqWrite = false;
playerDecide2_decide_reqRead = false;
_Player_1_decideNum = playerDecide2_decide_value;
_Player_1_depositPrepared = 1;
_step += 1;
}
if ((pmark == 23)&&(!(false || playerDecide2_decide_reqRead == false && playerDecide2_decide_reqWrite == false && playerDecide2_decideMax_reqRead == false && playerDecide2_decideMax_reqWrite == true || playerDecide2_decideMax_reqRead && playerDecide2_decideMax_reqWrite || playerDecide2_maxPrepared == 1 && playerDecide2_decidenum < playerDecide2_max || playerDecide2_maxPrepared == 1) && playerDecide2_decide_reqWrite && playerDecide2_decide_reqRead && !(false || !(Contract_Deposit1_reqRead) && Contract_player1Played == 0 && Contract_gameFinished == 0 || !(Contract_Deposit2_reqRead) && Contract_player2Played == 0 && Contract_gameFinished == 0) && Contract_Deposit1_reqRead && Contract_Deposit1_reqWrite && Contract_gameFinished == 0 && !(false || _Player_1_initial == 1 || playerDecide2_decide_reqRead == false && playerDecide2_decide_reqWrite == false && playerDecide2_decideMax_reqWrite == true && playerDecide2_decideMax_reqRead == true) && playerDecide2_decide_reqRead == true && playerDecide2_decide_reqWrite == true && !(false || _Player_0_initial == 1 || playerDecide1_decide_reqRead == false && playerDecide1_decide_reqWrite == false && playerDecide1_decideMax_reqWrite == true && playerDecide1_decideMax_reqRead == true || playerDecide1_decide_reqRead == true && playerDecide1_decide_reqWrite == true || _Player_0_depositPrepared == 1) && Contract_Deposit1_reqRead == true && Contract_Deposit1_reqWrite == true)){Contract_Deposit1_reqWrite = false;
Contract_Deposit1_reqRead = false;
Contract_player1Deposit = Contract_player1Deposit + Contract_Deposit1_value;
Contract_player1Played = 1;
playerDecide2_decide_reqWrite = false;
playerDecide2_decide_reqRead = false;
_Player_1_decideNum = playerDecide2_decide_value;
_Player_1_depositPrepared = 1;
_step += 1;
}
if ((pmark == 24)&&(!(false || !(Contract_Deposit1_reqRead) && Contract_player1Played == 0 && Contract_gameFinished == 0 || !(Contract_Deposit2_reqRead) && Contract_player2Played == 0 && Contract_gameFinished == 0 || Contract_Deposit1_reqRead && Contract_Deposit1_reqWrite && Contract_gameFinished == 0) && Contract_Deposit2_reqRead && Contract_Deposit2_reqWrite && Contract_gameFinished == 0 && !(false || _Player_1_initial == 1 || playerDecide2_decide_reqRead == false && playerDecide2_decide_reqWrite == false && playerDecide2_decideMax_reqWrite == true && playerDecide2_decideMax_reqRead == true || playerDecide2_decide_reqRead == true && playerDecide2_decide_reqWrite == true || _Player_1_depositPrepared == 1) && Contract_Deposit2_reqRead == true && Contract_Deposit2_reqWrite == true)){Contract_Deposit2_reqWrite = false;
Contract_Deposit2_reqRead = false;
Contract_player2Deposit = Contract_player2Deposit + Contract_Deposit2_value;
Contract_player2Played = 1;
_step += 1;
}
if ((pmark == 25)&&(!(false || !(Contract_Deposit1_reqRead) && Contract_player1Played == 0 && Contract_gameFinished == 0 || !(Contract_Deposit2_reqRead) && Contract_player2Played == 0 && Contract_gameFinished == 0 || Contract_Deposit1_reqRead && Contract_Deposit1_reqWrite && Contract_gameFinished == 0) && Contract_Deposit2_reqRead && Contract_Deposit2_reqWrite && Contract_gameFinished == 0 && !(false || playerDecide1_decide_reqRead == false && playerDecide1_decide_reqWrite == false && playerDecide1_decideMax_reqRead == false && playerDecide1_decideMax_reqWrite == true) && playerDecide1_decideMax_reqRead && playerDecide1_decideMax_reqWrite && !(false || _Player_1_initial == 1 || playerDecide2_decide_reqRead == false && playerDecide2_decide_reqWrite == false && playerDecide2_decideMax_reqWrite == true && playerDecide2_decideMax_reqRead == true || playerDecide2_decide_reqRead == true && playerDecide2_decide_reqWrite == true || _Player_1_depositPrepared == 1) && Contract_Deposit2_reqRead == true && Contract_Deposit2_reqWrite == true && !(false || _Player_0_initial == 1) && playerDecide1_decide_reqRead == false && playerDecide1_decide_reqWrite == false && playerDecide1_decideMax_reqWrite == true && playerDecide1_decideMax_reqRead == true)){Contract_Deposit2_reqWrite = false;
Contract_Deposit2_reqRead = false;
Contract_player2Deposit = Contract_player2Deposit + Contract_Deposit2_value;
Contract_player2Played = 1;
playerDecide1_decideMax_value = _Player_0_capital;
playerDecide1_decideMax_reqWrite = false;
playerDecide1_decideMax_reqRead = false;
playerDecide1_decide_reqRead = true;
playerDecide1_max = playerDecide1_decideMax_value;
playerDecide1_maxPrepared = 1;
playerDecide1_decidenum = 0;
_step += 1;
}
if ((pmark == 26)&&(!(false || !(Contract_Deposit1_reqRead) && Contract_player1Played == 0 && Contract_gameFinished == 0 || !(Contract_Deposit2_reqRead) && Contract_player2Played == 0 && Contract_gameFinished == 0 || Contract_Deposit1_reqRead && Contract_Deposit1_reqWrite && Contract_gameFinished == 0) && Contract_Deposit2_reqRead && Contract_Deposit2_reqWrite && Contract_gameFinished == 0 && !(false || playerDecide1_decide_reqRead == false && playerDecide1_decide_reqWrite == false && playerDecide1_decideMax_reqRead == false && playerDecide1_decideMax_reqWrite == true || playerDecide1_decideMax_reqRead && playerDecide1_decideMax_reqWrite || playerDecide1_maxPrepared == 1 && playerDecide1_decidenum < playerDecide1_max || playerDecide1_maxPrepared == 1) && playerDecide1_decide_reqWrite && playerDecide1_decide_reqRead && !(false || _Player_1_initial == 1 || playerDecide2_decide_reqRead == false && playerDecide2_decide_reqWrite == false && playerDecide2_decideMax_reqWrite == true && playerDecide2_decideMax_reqRead == true || playerDecide2_decide_reqRead == true && playerDecide2_decide_reqWrite == true || _Player_1_depositPrepared == 1) && Contract_Deposit2_reqRead == true && Contract_Deposit2_reqWrite == true && !(false || _Player_0_initial == 1 || playerDecide1_decide_reqRead == false && playerDecide1_decide_reqWrite == false && playerDecide1_decideMax_reqWrite == true && playerDecide1_decideMax_reqRead == true) && playerDecide1_decide_reqRead == true && playerDecide1_decide_reqWrite == true)){playerDecide1_decide_reqWrite = false;
playerDecide1_decide_reqRead = false;
_Player_0_decideNum = playerDecide1_decide_value;
_Player_0_depositPrepared = 1;
Contract_Deposit2_reqWrite = false;
Contract_Deposit2_reqRead = false;
Contract_player2Deposit = Contract_player2Deposit + Contract_Deposit2_value;
Contract_player2Played = 1;
_step += 1;
}
if ((pmark == 27)&&(!(false || !(Contract_Deposit1_reqRead) && Contract_player1Played == 0 && Contract_gameFinished == 0 || !(Contract_Deposit2_reqRead) && Contract_player2Played == 0 && Contract_gameFinished == 0 || Contract_Deposit1_reqRead && Contract_Deposit1_reqWrite && Contract_gameFinished == 0 || Contract_Deposit2_reqRead && Contract_Deposit2_reqWrite && Contract_gameFinished == 0 || Contract_player1Played == 1 && Contract_player2Played == 1 && Contract_gameFinished == 0) && Contract_turnEnd1_reqRead && Contract_turnEnd1_reqWrite && Contract_turnEnd2_reqRead && Contract_turnEnd2_reqWrite && !(false || _Player_1_initial == 1 || playerDecide2_decide_reqRead == false && playerDecide2_decide_reqWrite == false && playerDecide2_decideMax_reqWrite == true && playerDecide2_decideMax_reqRead == true || playerDecide2_decide_reqRead == true && playerDecide2_decide_reqWrite == true || _Player_1_depositPrepared == 1 || Contract_Deposit2_reqRead == true && Contract_Deposit2_reqWrite == true) && Contract_turnEnd2_reqWrite == true && Contract_turnEnd2_reqRead == true && !(false || _Player_0_initial == 1 || playerDecide1_decide_reqRead == false && playerDecide1_decide_reqWrite == false && playerDecide1_decideMax_reqWrite == true && playerDecide1_decideMax_reqRead == true || playerDecide1_decide_reqRead == true && playerDecide1_decide_reqWrite == true || _Player_0_depositPrepared == 1 || Contract_Deposit1_reqRead == true && Contract_Deposit1_reqWrite == true) && Contract_turnEnd1_reqWrite == true && Contract_turnEnd1_reqRead == true)){Contract_turnEnd1_reqWrite = false;
Contract_turnEnd1_reqRead = false;
playerDecide1_decideMax_value = _Player_0_capital;
playerDecide1_decideMax_reqWrite = true;
Contract_turnEnd2_reqWrite = false;
Contract_turnEnd2_reqRead = false;
playerDecide2_decideMax_value = _Player_1_capital;
playerDecide2_decideMax_reqWrite = true;
_step += 1;
}
if ((pmark == 28)&&(!(false || !(Contract_Deposit1_reqRead) && Contract_player1Played == 0 && Contract_gameFinished == 0 || !(Contract_Deposit2_reqRead) && Contract_player2Played == 0 && Contract_gameFinished == 0 || Contract_Deposit1_reqRead && Contract_Deposit1_reqWrite && Contract_gameFinished == 0 || Contract_Deposit2_reqRead && Contract_Deposit2_reqWrite && Contract_gameFinished == 0 || Contract_player1Played == 1 && Contract_player2Played == 1 && Contract_gameFinished == 0 || Contract_turnEnd1_reqRead && Contract_turnEnd1_reqWrite && Contract_turnEnd2_reqRead && Contract_turnEnd2_reqWrite) && Contract_withDraw1_reqRead && Contract_withDraw1_reqWrite && Contract_withDraw2_reqRead && Contract_withDraw2_reqWrite && !(false || _Player_1_initial == 1 || playerDecide2_decide_reqRead == false && playerDecide2_decide_reqWrite == false && playerDecide2_decideMax_reqWrite == true && playerDecide2_decideMax_reqRead == true || playerDecide2_decide_reqRead == true && playerDecide2_decide_reqWrite == true || _Player_1_depositPrepared == 1 || Contract_Deposit2_reqRead == true && Contract_Deposit2_reqWrite == true || Contract_turnEnd2_reqWrite == true && Contract_turnEnd2_reqRead == true) && Contract_withDraw2_reqRead == true && Contract_withDraw2_reqWrite == true && !(false || _Player_0_initial == 1 || playerDecide1_decide_reqRead == false && playerDecide1_decide_reqWrite == false && playerDecide1_decideMax_reqWrite == true && playerDecide1_decideMax_reqRead == true || playerDecide1_decide_reqRead == true && playerDecide1_decide_reqWrite == true || _Player_0_depositPrepared == 1 || Contract_Deposit1_reqRead == true && Contract_Deposit1_reqWrite == true || Contract_turnEnd1_reqWrite == true && Contract_turnEnd1_reqRead == true) && Contract_withDraw1_reqRead == true && Contract_withDraw1_reqWrite == true)){Contract_withDraw1_reqWrite = false;
Contract_withDraw1_reqRead = false;
_Player_0_capital = _Player_0_capital + Contract_withDraw1_value;
Contract_withDraw2_reqWrite = false;
Contract_withDraw2_reqRead = false;
_Player_1_capital = _Player_1_capital + Contract_withDraw2_value;
_step += 1;
}
}
if (((Object) playerDecide1_max instanceof Integer)||((Object) playerDecide1_max instanceof Boolean)) {
System.out.print("playerDecide1_max: ");
System.out.println(playerDecide1_max);
}
if (((Object) playerDecide1_maxPrepared instanceof Integer)||((Object) playerDecide1_maxPrepared instanceof Boolean)) {
System.out.print("playerDecide1_maxPrepared: ");
System.out.println(playerDecide1_maxPrepared);
}
if (((Object) playerDecide1_decidenum instanceof Integer)||((Object) playerDecide1_decidenum instanceof Boolean)) {
System.out.print("playerDecide1_decidenum: ");
System.out.println(playerDecide1_decidenum);
}
if (((Object) playerDecide1_decideMax_value instanceof Integer)||((Object) playerDecide1_decideMax_value instanceof Boolean)) {
System.out.print("playerDecide1_decideMax_value: ");
System.out.println(playerDecide1_decideMax_value);
}
if (((Object) playerDecide1_decideMax_reqRead instanceof Integer)||((Object) playerDecide1_decideMax_reqRead instanceof Boolean)) {
System.out.print("playerDecide1_decideMax_reqRead: ");
System.out.println(playerDecide1_decideMax_reqRead);
}
if (((Object) playerDecide1_decideMax_reqWrite instanceof Integer)||((Object) playerDecide1_decideMax_reqWrite instanceof Boolean)) {
System.out.print("playerDecide1_decideMax_reqWrite: ");
System.out.println(playerDecide1_decideMax_reqWrite);
}
if (((Object) playerDecide1_decide_value instanceof Integer)||((Object) playerDecide1_decide_value instanceof Boolean)) {
System.out.print("playerDecide1_decide_value: ");
System.out.println(playerDecide1_decide_value);
}
if (((Object) playerDecide1_decide_reqRead instanceof Integer)||((Object) playerDecide1_decide_reqRead instanceof Boolean)) {
System.out.print("playerDecide1_decide_reqRead: ");
System.out.println(playerDecide1_decide_reqRead);
}
if (((Object) playerDecide1_decide_reqWrite instanceof Integer)||((Object) playerDecide1_decide_reqWrite instanceof Boolean)) {
System.out.print("playerDecide1_decide_reqWrite: ");
System.out.println(playerDecide1_decide_reqWrite);
}
if (((Object) playerDecide2_max instanceof Integer)||((Object) playerDecide2_max instanceof Boolean)) {
System.out.print("playerDecide2_max: ");
System.out.println(playerDecide2_max);
}
if (((Object) playerDecide2_maxPrepared instanceof Integer)||((Object) playerDecide2_maxPrepared instanceof Boolean)) {
System.out.print("playerDecide2_maxPrepared: ");
System.out.println(playerDecide2_maxPrepared);
}
if (((Object) playerDecide2_decidenum instanceof Integer)||((Object) playerDecide2_decidenum instanceof Boolean)) {
System.out.print("playerDecide2_decidenum: ");
System.out.println(playerDecide2_decidenum);
}
if (((Object) playerDecide2_decideMax_value instanceof Integer)||((Object) playerDecide2_decideMax_value instanceof Boolean)) {
System.out.print("playerDecide2_decideMax_value: ");
System.out.println(playerDecide2_decideMax_value);
}
if (((Object) playerDecide2_decideMax_reqRead instanceof Integer)||((Object) playerDecide2_decideMax_reqRead instanceof Boolean)) {
System.out.print("playerDecide2_decideMax_reqRead: ");
System.out.println(playerDecide2_decideMax_reqRead);
}
if (((Object) playerDecide2_decideMax_reqWrite instanceof Integer)||((Object) playerDecide2_decideMax_reqWrite instanceof Boolean)) {
System.out.print("playerDecide2_decideMax_reqWrite: ");
System.out.println(playerDecide2_decideMax_reqWrite);
}
if (((Object) playerDecide2_decide_value instanceof Integer)||((Object) playerDecide2_decide_value instanceof Boolean)) {
System.out.print("playerDecide2_decide_value: ");
System.out.println(playerDecide2_decide_value);
}
if (((Object) playerDecide2_decide_reqRead instanceof Integer)||((Object) playerDecide2_decide_reqRead instanceof Boolean)) {
System.out.print("playerDecide2_decide_reqRead: ");
System.out.println(playerDecide2_decide_reqRead);
}
if (((Object) playerDecide2_decide_reqWrite instanceof Integer)||((Object) playerDecide2_decide_reqWrite instanceof Boolean)) {
System.out.print("playerDecide2_decide_reqWrite: ");
System.out.println(playerDecide2_decide_reqWrite);
}
if (((Object) Contract_player1Played instanceof Integer)||((Object) Contract_player1Played instanceof Boolean)) {
System.out.print("Contract_player1Played: ");
System.out.println(Contract_player1Played);
}
if (((Object) Contract_player2Played instanceof Integer)||((Object) Contract_player2Played instanceof Boolean)) {
System.out.print("Contract_player2Played: ");
System.out.println(Contract_player2Played);
}
if (((Object) Contract_gameFinished instanceof Integer)||((Object) Contract_gameFinished instanceof Boolean)) {
System.out.print("Contract_gameFinished: ");
System.out.println(Contract_gameFinished);
}
if (((Object) Contract_player1Deposit instanceof Integer)||((Object) Contract_player1Deposit instanceof Boolean)) {
System.out.print("Contract_player1Deposit: ");
System.out.println(Contract_player1Deposit);
}
if (((Object) Contract_player2Deposit instanceof Integer)||((Object) Contract_player2Deposit instanceof Boolean)) {
System.out.print("Contract_player2Deposit: ");
System.out.println(Contract_player2Deposit);
}
if (((Object) Contract_gains instanceof Integer)||((Object) Contract_gains instanceof Boolean)) {
System.out.print("Contract_gains: ");
System.out.println(Contract_gains);
}
if (((Object) Contract__test_ instanceof Integer)||((Object) Contract__test_ instanceof Boolean)) {
System.out.print("Contract__test_: ");
System.out.println(Contract__test_);
}
if (((Object) Contract_Deposit1_value instanceof Integer)||((Object) Contract_Deposit1_value instanceof Boolean)) {
System.out.print("Contract_Deposit1_value: ");
System.out.println(Contract_Deposit1_value);
}
if (((Object) Contract_Deposit1_reqRead instanceof Integer)||((Object) Contract_Deposit1_reqRead instanceof Boolean)) {
System.out.print("Contract_Deposit1_reqRead: ");
System.out.println(Contract_Deposit1_reqRead);
}
if (((Object) Contract_Deposit1_reqWrite instanceof Integer)||((Object) Contract_Deposit1_reqWrite instanceof Boolean)) {
System.out.print("Contract_Deposit1_reqWrite: ");
System.out.println(Contract_Deposit1_reqWrite);
}
if (((Object) Contract_Deposit2_value instanceof Integer)||((Object) Contract_Deposit2_value instanceof Boolean)) {
System.out.print("Contract_Deposit2_value: ");
System.out.println(Contract_Deposit2_value);
}
if (((Object) Contract_Deposit2_reqRead instanceof Integer)||((Object) Contract_Deposit2_reqRead instanceof Boolean)) {
System.out.print("Contract_Deposit2_reqRead: ");
System.out.println(Contract_Deposit2_reqRead);
}
if (((Object) Contract_Deposit2_reqWrite instanceof Integer)||((Object) Contract_Deposit2_reqWrite instanceof Boolean)) {
System.out.print("Contract_Deposit2_reqWrite: ");
System.out.println(Contract_Deposit2_reqWrite);
}
if (((Object) Contract_withDraw1_value instanceof Integer)||((Object) Contract_withDraw1_value instanceof Boolean)) {
System.out.print("Contract_withDraw1_value: ");
System.out.println(Contract_withDraw1_value);
}
if (((Object) Contract_withDraw1_reqRead instanceof Integer)||((Object) Contract_withDraw1_reqRead instanceof Boolean)) {
System.out.print("Contract_withDraw1_reqRead: ");
System.out.println(Contract_withDraw1_reqRead);
}
if (((Object) Contract_withDraw1_reqWrite instanceof Integer)||((Object) Contract_withDraw1_reqWrite instanceof Boolean)) {
System.out.print("Contract_withDraw1_reqWrite: ");
System.out.println(Contract_withDraw1_reqWrite);
}
if (((Object) Contract_withDraw2_value instanceof Integer)||((Object) Contract_withDraw2_value instanceof Boolean)) {
System.out.print("Contract_withDraw2_value: ");
System.out.println(Contract_withDraw2_value);
}
if (((Object) Contract_withDraw2_reqRead instanceof Integer)||((Object) Contract_withDraw2_reqRead instanceof Boolean)) {
System.out.print("Contract_withDraw2_reqRead: ");
System.out.println(Contract_withDraw2_reqRead);
}
if (((Object) Contract_withDraw2_reqWrite instanceof Integer)||((Object) Contract_withDraw2_reqWrite instanceof Boolean)) {
System.out.print("Contract_withDraw2_reqWrite: ");
System.out.println(Contract_withDraw2_reqWrite);
}
if (((Object) Contract_turnEnd1_value instanceof Integer)||((Object) Contract_turnEnd1_value instanceof Boolean)) {
System.out.print("Contract_turnEnd1_value: ");
System.out.println(Contract_turnEnd1_value);
}
if (((Object) Contract_turnEnd1_reqRead instanceof Integer)||((Object) Contract_turnEnd1_reqRead instanceof Boolean)) {
System.out.print("Contract_turnEnd1_reqRead: ");
System.out.println(Contract_turnEnd1_reqRead);
}
if (((Object) Contract_turnEnd1_reqWrite instanceof Integer)||((Object) Contract_turnEnd1_reqWrite instanceof Boolean)) {
System.out.print("Contract_turnEnd1_reqWrite: ");
System.out.println(Contract_turnEnd1_reqWrite);
}
if (((Object) Contract_turnEnd2_value instanceof Integer)||((Object) Contract_turnEnd2_value instanceof Boolean)) {
System.out.print("Contract_turnEnd2_value: ");
System.out.println(Contract_turnEnd2_value);
}
if (((Object) Contract_turnEnd2_reqRead instanceof Integer)||((Object) Contract_turnEnd2_reqRead instanceof Boolean)) {
System.out.print("Contract_turnEnd2_reqRead: ");
System.out.println(Contract_turnEnd2_reqRead);
}
if (((Object) Contract_turnEnd2_reqWrite instanceof Integer)||((Object) Contract_turnEnd2_reqWrite instanceof Boolean)) {
System.out.print("Contract_turnEnd2_reqWrite: ");
System.out.println(Contract_turnEnd2_reqWrite);
}
if (((Object) _Player_0_capital instanceof Integer)||((Object) _Player_0_capital instanceof Boolean)) {
System.out.print("_Player_0_capital: ");
System.out.println(_Player_0_capital);
}
if (((Object) _Player_0_decideNum instanceof Integer)||((Object) _Player_0_decideNum instanceof Boolean)) {
System.out.print("_Player_0_decideNum: ");
System.out.println(_Player_0_decideNum);
}
if (((Object) _Player_0_initial instanceof Integer)||((Object) _Player_0_initial instanceof Boolean)) {
System.out.print("_Player_0_initial: ");
System.out.println(_Player_0_initial);
}
if (((Object) _Player_0_depositPrepared instanceof Integer)||((Object) _Player_0_depositPrepared instanceof Boolean)) {
System.out.print("_Player_0_depositPrepared: ");
System.out.println(_Player_0_depositPrepared);
}
if (((Object) _Player_1_capital instanceof Integer)||((Object) _Player_1_capital instanceof Boolean)) {
System.out.print("_Player_1_capital: ");
System.out.println(_Player_1_capital);
}
if (((Object) _Player_1_decideNum instanceof Integer)||((Object) _Player_1_decideNum instanceof Boolean)) {
System.out.print("_Player_1_decideNum: ");
System.out.println(_Player_1_decideNum);
}
if (((Object) _Player_1_initial instanceof Integer)||((Object) _Player_1_initial instanceof Boolean)) {
System.out.print("_Player_1_initial: ");
System.out.println(_Player_1_initial);
}
if (((Object) _Player_1_depositPrepared instanceof Integer)||((Object) _Player_1_depositPrepared instanceof Boolean)) {
System.out.print("_Player_1_depositPrepared: ");
System.out.println(_Player_1_depositPrepared);
}
}
}