package com.company;

import java.util.Scanner;

public class twogrps {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        for (int k = 0; k < t; k++) {


            int a = input.nextInt();
            int b = input.nextInt();
            int c = input.nextInt();
            int arr[] = new int[4];
            arr[1] = a;
            arr[2] = b;
            arr[3] = c;
            int result = 1 * a + 2 * b + 3 * c;
            int halfresult = result / 2;
            if (result % 2 != 0) {
                System.out.println("N0");
            } else {
                if (a != 0 && b != 0 && c != 0) {
                    System.out.println("YES");
                } else if (a == 0 && b != 0 && c != 0) {
                    int flag = 0;


                    while (b>0) {

                        int temp = halfresult / 2;
                        if (temp > b) {
                            int temp1 = halfresult;
                            temp1 = temp1 - 2 * b;
                            if (temp1 % 3 == 0) {
                                int temp2 = temp1 / 3;
                                if (temp2 <= c) {
                                    flag = 1;
                                    break;

                                }
                            }


                        }
                        else {
                            if (halfresult%2==0){
                                flag=1;
                                break;

                            }
                            else {
                                int temp1 = halfresult;
                                temp1 = temp1 - 2 * temp;
                                if (temp1 % 3 == 0) {
                                    int temp2 = temp1 / 3;
                                    if (temp2 <= c) {
                                        flag = 1;
                                        break;

                                    }
                                }


                            }
                        }



                        b--;


                    }
                if (flag == 1) {
                    System.out.println("YES");
                    break;}
                    if (flag==0){
                        System.out.println("NO");
                    }

                } else if (a != 0 && b == 0 && c != 0) {
                    int flag = 0;

                    while (a != 0) {

                        int temp = halfresult / 1;
                        if (temp > a) {
                            int temp1 = halfresult;
                            temp1 = temp1 - 1 * a;
                            if (halfresult % 3 == 0) {
                                int temp2 = temp1 / 3;
                                if (temp2 <= c) {
                                    flag = 1;

                                }
                            }

                        }
                        else {


                                int temp1 = halfresult;
                                temp1 = temp1 - 1 * temp;
                                if (temp1==0) {
                                    flag = 1;
                                    break;
                                }

                                if (temp1 % 3 == 0) {
                                    int temp2 = temp1 / 3;
                                    if (temp2 <= c) {
                                        flag = 1;
                                        break;

                                    }
                                }


                            }
                        }

                        a--;



                    if (flag == 1) {
                        System.out.println("YES");
                        break;
                    }
                    if (flag==0){
                        System.out.println("NO");
                    }

                } else if (a != 0 && b != 0 && c == 0) {
                    int flag = 0;

                    while (a != 0) {

                        int temp = halfresult / 1;
                        if (temp > b) {
                            int temp1 = halfresult;
                            temp1 = temp1 - 1 * a;
                            if (halfresult % 2 == 0) {
                                int temp2 = temp1 / 2;
                                if (temp2 <= c) {
                                    flag = 1;
                                    break;

                                }
                            }

                        }
                        else {


                            int temp1 = halfresult;
                            temp1 = temp1 - 1 * temp;
                            if (temp1==0) {
                                flag = 1;
                                break;
                            }

                            if (temp1 % 2 == 0) {
                                int temp2 = temp1 / 2;
                                if (temp2 <= c) {
                                    flag = 1;
                                    break;

                                }
                            }


                        }


                        a--;


                    }
                    if (flag == 1) {
                        System.out.println("YES");
                        break;
                    }
                    if (flag==0){
                        System.out.println("NO");
                    }

                } else if (a == 0 && b == 0 && c != 0) {
                    if (c % 2 == 0) {
                        System.out.println("YES");
                    }
                    else {
                        System.out.println("NO");
                    }
                } else if (a != 0 && b == 0 && c == 0) {
                    if (a % 2 == 0) {
                        System.out.println("YES");
                    }
                    else {
                        System.out.println("NO");
                    }
                } else if (a == 0 && b != 0 && c == 0) {
                    if (b % 2 == 0) {
                        System.out.println("YES");
                    }
                    else {
                        System.out.println("NO");
                    }
                }
            }

        }
    }
}
