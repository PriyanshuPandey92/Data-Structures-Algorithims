#include <stdio.h>
#include <stdlib.h>

struct node {
    int data;
    struct node* next;
};

struct node* reverseLL(struct node* head) {
    struct node* temp = head;
    struct node* prev = NULL;
    struct node* next;

    while (temp != NULL) {
        next = temp->next;
        temp->next = prev;
        prev = temp;
        temp = next;
    }
    return prev;
}

struct node* insertatFront(struct node* head, int data) {
    struct node* temp = (struct node*)malloc(sizeof(struct node));
    temp->data = data;
    temp->next = head;
    return temp;
}

void display(struct node* head) {
    struct node* current = head;
    while (current != NULL) {
        printf("%d->", current->data);
        current = current->next;
    }
    printf("NULL\n");
}

int main() {
    struct node* head = NULL;
    head = insertatFront(head, 10);
    head = insertatFront(head, 20);
    head = insertatFront(head, 30);
    head = insertatFront(head, 40);
    head = insertatFront(head, 50);
    head = insertatFront(head, 60);
    head = insertatFront(head, 70);

    printf("LL before Reversal\n");
    display(head);

    head= reverseLL(head);

    printf("LL after Reversal\n");
    display(head);

    return 0;
}
