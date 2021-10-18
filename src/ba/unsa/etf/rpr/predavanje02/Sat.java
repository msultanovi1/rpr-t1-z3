package ba.unsa.etf.rpr.predavanje02;

public class Sat {

    private int sati, minute, sekunde;

    public Sat(int sati, int minute, int sekunde){
        postavi(sati, minute, sekunde);
    }
    public void postavi(int satiNovi, int minuteNovi, int sekundeNovi){
         sati = satiNovi; minute = minuteNovi; sekunde = sekundeNovi;
    }
    public void sljedeci(){
        sekunde = sekunde +1;
        if(sekunde == 60){
            sekunde = 0;
            minute = minute +1;

        }
        if(minute == 60){
            minute = 0;
            sati = sati +1;
        }
        if(sati == 24) sati = 0;
    }
    public void prethodni(){
        sekunde = sekunde - 1;
        if(sekunde == -1){
            sekunde = 59;
            minute = minute - 1;

        }
        if(minute == -1){
            minute = 59;
            sati = sati - 1;
        }
        if(sati == -1) sati = 23;
    }
    public void pomjeriZa(int pomak){
        if (pomak>0) for (int i=0; i<pomak; i++) sljedeci();
		else for (int i=0; i<-pomak; i++) prethodni();
    }
    public int dajSate(){
        return sati;
    }
    public int dajMinutete(){
        return minute;
    }
    public int dajSekunde(){
        return sekunde;
    }
    public void ispisi(){
        System.out.println(sati + ":" + minute + ":" + sekunde);
    }

    public static void main(String[] args) {
	    Sat s = new Sat(15,30,45);
        s.ispisi();
        s.sljedeci();
        s.ispisi();
        s.pomjeriZa(-48);
        s.ispisi();
        s.postavi(0,0,0);
        s.ispisi();
    }
}

/*
#include <iostream>

using namespace std;

class Sat {
	int sati,minute,sekunde;
public:
	Sat(int sati, int minute, int sekunde) { Postavi(sati,minute,sekunde); }
	void Postavi(int sati, int minute, int sekunde) { Sat::sati=sati; Sat::minute=minute; Sat::sekunde=sekunde; }
	void Sljedeci() {
		sekunde++;
		if (sekunde==60) { sekunde=0; minute++; }
		if (minute==60) { minute=0; sati++; }
		if (sati==24) sati=0;
	}
	void Prethodni() {
		sekunde--;
		if (sekunde==-1) { sekunde=59; minute--; }
		if (minute==-1) { minute=59; sati--; }
		if (sati==-1) sati=23;
	}
	void PomjeriZa(int pomak) {
		if (pomak>0) for (int i(0); i<pomak; i++) Sljedeci();
		else for (int i(0); i<-pomak; i++) Prethodni();
	}
	int DajSate() const { return sati; }
	int DajMinute() const { return minute; }
	int DajSekunde() const { return sekunde; }
	void Ispisi() const { cout<<sati<<":"<<minute<<":"<<sekunde<<endl; }
};

int main() {
	Sat s(15,30,45);
	s.Ispisi();
	s.Sljedeci();
	s.Ispisi();
	s.PomjeriZa(-48);
	s.Ispisi();
	s.Postavi(0,0,0);
	s.Ispisi();
	return 0;
}

 */