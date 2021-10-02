/*
Binary Search Tree - Orders
Create a binary search tree with given input data.
Print all the following level orders.

Sample Test Case:

Input : 
5 8 3 4 1 9 6 7 2 -1

Output :
1. Preorder : 5 3 1 2 4 8 6 7 9
2. Inorder : 1 2 3 4 5 6 7 8 9
3. Postorder : 2 1 4 3 7 6 9 8 5
*/

#include <iostream>
using namespace std;

//Binary Search Tree Node Structure Definition
struct bstnode
{
    bstnode *lchild;          //left child
    int data;                 //data
    bstnode *rchild;          //right child
};
typedef bstnode *BSTPTR;

//Inserts key values to binary search tree
void insert(BSTPTR &t, int key)
{
    if (!t)
    {
        t = new bstnode;
        t->data = key;
        t->lchild = t->rchild = NULL;
    }
    else if (t->data > key)
        insert(t->lchild, key);
    else
        insert(t->rchild, key);
}

//Preorder Print
void preorder(BSTPTR t)
{
    if (t == NULL)
        return;
    cout << t->data << ' ';
    preorder(t->lchild);
    preorder(t->rchild);
}

//Inorder Print
void inorder(BSTPTR t)
{
    if (t == NULL)
        return;
    inorder(t->lchild);
    cout << t->data << ' ';
    inorder(t->rchild);
}

// Postorder Print
void postorder(BSTPTR t)
{
    if (t == NULL)
        return;
    postorder(t->lchild);
    postorder(t->rchild);
    cout << t->data << ' ';
}

int main() 
{
    BSTPTR t = NULL;
    int key;
    //Input key values and insert to binary search tree
    //Input terminated by -1
    while (cin >> key && key != -1) 
    {
        insert(t, key);
    }   
    //Print preorder
    preorder(t);
    cout << '\n';
    //Print inorder
    inorder(t);
    cout << '\n';
    //Print postorder
    postorder(t);
    return 0;
}