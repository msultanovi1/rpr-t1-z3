public class Main {

    public static void main(String[] args) {
        Sat s = new Sat(19,23,55);
        s.ispisi();
        s.sljedeci();
        s.ispisi();
        s.pomjeriZa(-35);
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