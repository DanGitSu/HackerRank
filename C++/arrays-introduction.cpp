#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;


int main() {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT */       
    
    int n;
    scanf("%d", &n);
    int a[n];
    for (int i = n-1; i >= 0 ; i--){
        scanf("%d", &a[i]);
    }
    for (int i = 0; i < n; i++) cout << a[i] << " ";
    cout << "\n";
    
    return 0;
}
