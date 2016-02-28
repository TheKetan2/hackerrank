#include <iostream>
using namespace std;

int main() {
    // Complete the code.
    string ch[] ={"zero","one","two","three","four","five","six","seven","eight","nine"};
    int num1,num2;
    cin >>num1;
    cin >>num2;
    for(int i = num1;i <=num2; i++){
        if(i <=9){
            cout <<ch[i]<<endl;
        }
        if(i>9)break;
    }
    for(int i = 9; i<=num2; i++){
        if(i>9){
            if(i%2==0)
                cout <<"even"<<endl;
            else
                cout <<"odd"<<endl;
        }
            
    }
    
    
    return 0;
}
