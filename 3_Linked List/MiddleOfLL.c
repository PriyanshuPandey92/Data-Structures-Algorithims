#include <stdio.h>
#include <stdlib.h>
struct node{
    int data;
    struct node*next;
};
//example= if LL=> 1-> 2-> 3-> 4-> 5-> 6-> NULL
//Then Return=> 4-> 5-> 6-> NULL
struct node* aftermiddle ( struct node* head ){
    struct node* temp = head;
    int count = 0;
    while ( temp != NULL){
        count+= 1;
        temp = temp->next;
    }
    int mid=(count/2);
    int i=0;
    temp=head;
    
    while(temp!=NULL){
        if(i>=mid){
            printf("%d->",temp->data);
        }
        i+=1;
        temp=temp->next;
    }
    printf("NULL\n");
    return head;
    
    
}

struct node* insertatFront(struct node* head, int data) {
    struct node* temp = (struct node*)malloc(sizeof(struct node));
    temp->data = data;
    temp->next = head;
    return temp;
}


void display(struct node* head) {
    struct node* current;
    current = head;
    while (current != NULL) {
        printf("%d\n", current->data);
        current = current->next;
    }
}


int main(){
    struct node* head = NULL;
    head = insertatFront(head,80);
    head = insertatFront(head,70);
    head = insertatFront(head,60);
    head = insertatFront(head,50);
    head = insertatFront(head,40);
    head = insertatFront(head,30);
    head = insertatFront(head,20);
    head = insertatFront(head,10);
    
    head=aftermiddle(head);
    
    return 0;
}
