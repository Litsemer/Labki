#include <iostream>
#include<conio.h>
using namespace std;
double f(double x){
	return x*x + 2 * x - 3;
}

int main(){
	double a, b, c, 
		eps=0.01;
	int w, licznik = 0;
	char end;
	end = 'n';
	while (end !='t'){
		cout << "Podaj a: " << endl;
		cin >> a;
		cout << "Podaj b: " << endl;
		cin >> b;
		cout << "Wybur funkcij: " << endl;
		cin >> w;
		switch (w){


		case 1:
			while ((b - a) > 2 * eps){
				c = (a + b) / 2;
				if (f(c) == 0){
					cout << "x jest rowny zerowi!!!" << endl;
					break;
				}
				if (f(a)*f(c) < 0){
					b = c;
				}
				else
					a = c;
			
				
				licznik++;
				
			}
			break;
		}
		cout << "x= " << c;
		cout << endl;
		cout << "Iloscz iteracij: " << licznik << endl;
		cout << endl;
		cout << "czy zakonczyc program? (t/n) ";
		cin >> end;
	}
	_getch();
	return 0;
}
