#include <iostream>
#include<conio.h>
#include<math.h>

using namespace std;
double f(double x){
	return x*x + 2 * x - 3;
}

double f2(double x){
	return sin(x) + 1;
}
int main(){
	double a, b, c,
		eps;
	int w, licznik = 0;
	char end;
	end = 'n';
	while (end != 't'){
		cout << "Wybur funkcij: " << endl;
		cin >> w;
		cout << "Podaj a: " << endl;
		cin >> a;
		cout << "Podaj b: " << endl;
		cin >> b;
		cout << "Podaj dokladnosc Epsilon: " << endl;
		cin >> eps;

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
		case 2:
			while ((b - a) > 2 * eps){
				c = (a + b) / 2;
				if (f2(c) == 0){
					cout << "x jest rowny zerowi!!!" << endl;
					break;
				}
				if (f2(a)*f2(c) < 0){
					b = c;
				}
				else
					a = c;
				licznik++;

			}
			break;
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
