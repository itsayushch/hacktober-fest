/*
Binary Tree - Views
Creates a Binary Tree based on user input preorder serialized data.
Prints the left, right, top and bottom views of user-defined binary tree
    
Sample Test case : 

Input :
ABD#HLQ###M##E##CFIN####GJP#RS##T#UV#X#YZ####K###

Output :
Left View : A B D H L Q S U V X Y Z
Right View : A C G J K R T U V X Y Z
Top View : Q D B A C G U Y
Bottom View : Q N I S R V Z Y
*/

#include <iostream>
using namespace std;

//Binary Tree Structure Definition
struct btnode
{
    btnode *lchild; //left child
    char data;      //data
    btnode *rchild; //right child
};
typedef btnode *BTPTR;

//Creates Binary Tree based on preorder serialised user input
//Null node represented by # symbol
void create(BTPTR &t)
{
    char k;
    cin >> k;
    if (k == '#')
        return;
    t = new btnode;
    t->data = k;
    t->lchild = t->rchild = NULL;
    create(t->lchild);
    create(t->rchild);
}

//Stores top node of each column binary tree in view[] array using preorder traversal
//Keeps track of horizontal distance (md) covered in order to update view[] with topmost node
void top_view(BTPTR &t, char view[], int md)
{
    if (!t)
        return;
    if (view[md] == 0)
        view[md] = t->data;
    top_view(t->lchild, view, md - 1);
    top_view(t->rchild, view, md + 1);
}

//Stores bottom node of each column of binary tree in view[] array using postorder traversal
//Keeps track of levels/depth and horizontal distance (md) covered in order to update view[] with deepest node
void bottom_view(BTPTR t, char view[], int levels[], int md, int l = 0)
{
    if (!t)
        return;
    bottom_view(t->lchild, view, levels, md - 1, l + 1);
    bottom_view(t->rchild, view, levels, md + 1, l + 1);
    if (view[md] == 0 || levels[md] <= l)
    {
        view[md] = t->data;
        levels[md] = l;
    }
}

//Stores leftmost node of each level in view[] array using preorder traversal
//Keeps track of levels covered
void left_view(BTPTR t, char view[], int l)
{
    if (t == NULL)
        return;
    if (view[l] == 0)
        view[l] = t->data;
    left_view(t->lchild, view, l + 1);
    left_view(t->rchild, view, l + 1);
}

//Stores rightmost node of each level in view[] array using preorder traversal
//Keeps track of levels covered
void right_view(BTPTR t, char view[], int l)
{
    if (t == NULL)
        return;
    if (view[l] == 0)
        view[l] = t->data;
    right_view(t->rchild, view, l + 1);
    right_view(t->lchild, view, l + 1);
}

//Prints view after skipping the unused indices
void print_view(char view[])
{
    int i = 0;
    while (view[i] == 0)
        i++;
    while (view[i] != 0)
        cout << view[i++] << ' ';
    cout << '\n';
}

int main()
{
    BTPTR t = NULL;
    //Sets default horizontal distance/mid distance (md) of root node as 20
    int md = 20, i = 0, blevels[40] = {0};
    char tview[40] = {0}, bview[40] = {0}, lview[40] = {0}, rview[40] = {0};

    //Creates binary tree
    create(t);

    //Gets left view of binary tree
    cout << "Left view : ";
    left_view(t, lview, i);
    //Print left view of binary tree
    print_view(lview);

    //Gets right view of binary tree
    cout << "Right view : ";
    right_view(t, rview, i);
    //Prints right view of binary tree
    print_view(rview);

    //Gets top view of binary tree
    cout << "Top view : ";
    top_view(t, tview, md);
    //Prints top view of binary tree
    print_view(tview);

    //Gets bottom view of binary tree
    cout << "Bottom view : ";
    bottom_view(t, bview, blevels, md);
    //Prints bottom view of binary tree
    print_view(bview);

    return 0;
}