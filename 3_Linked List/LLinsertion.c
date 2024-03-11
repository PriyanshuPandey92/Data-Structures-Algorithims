#include <stdio.h>
#include <stdlib.h>
struct node{
    int id;
    struct node* next;
};

//This fuction will return updated head which is temp.
struct node* insertatFront(struct node*head,int data){
    struct node*temp=(struct node*)malloc(sizeof(struct node));
    temp->id=data;
    temp->next=head;
    return temp;
}


// |_1_|-->|_0_| this is our stack
//  temp= |_3_|
// now make a pointer(i.e. ptr here) and make it yo point |_0_| and then ptr->next=temp & temp->next=NULL
//Draw an diagram for better understanding
//since head is not changed hence it return head itself
struct node* insertatEnd(struct node*head,int data){
    struct node*temp=(struct node*)malloc(sizeof(struct node));
    struct node*ptr=head;
    while(ptr->next!=NULL){
        ptr=ptr->next;
    }
    ptr->next=temp;
    temp->id=data;
    temp->next=NULL;
    return head;

}

//Refer CodeWithHarry Video for reference
struct node* insertatIndex(struct node*head,int data,int index){
    struct node*temp=(struct node*)malloc(sizeof(struct node));
    temp->id=data;
    struct node*ptr=head;
    int i=0;
    while (i!=index-1){
        ptr=ptr->next;
        i++;
    }
    temp->next=ptr->next;
    ptr->next=temp;
    return head;
}

 

void display(struct node*head){
    struct node*current;
    current=head;
    while(current!=NULL){
        printf("%d\n",current->id);
        current=current->next;
    }
}

int main(){
    struct node*head=NULL;

    head=insertatFront(head,0);
    head=insertatFront(head,1);
    head=insertatEnd(head,3);
    head=insertatIndex(head,10,2);


    display(head);

    return 0;
}
