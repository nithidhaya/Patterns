int n = 4;
for (int i=1; i<=n; i++) {
    // Print spaces
    for (int j=i; j<n; j++) System.out.print(" ");
    // Decreasing numbers
    for (int j=i; j>0; j--) System.out.print(j);
    // Increasing numbers
    for (int j=2; j<=i; j++) System.out.print(j);
    System.out.println();
}
