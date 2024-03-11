#include <stdio.h>
#include <stdlib.h>

struct node {
    int data;
    struct node *next;
};

void RemovingDuplicated(struct node *head) {
    struct node *curr = head;
    struct node *temp;

    while (curr != NULL && curr->next != NULL) {
        if (curr->data == curr->next->data) {
            temp = curr->next;
            curr->next = temp->next;
            free(temp);
        } else {
            curr = curr->next;
        }
    }

    // Print the modified linked list
    curr = head;
    while (curr != NULL) {
        printf("%d->", curr->data);
        curr = curr->next;
    }
    printf("NULL");
}

struct node *insertAtFront(struct node *head, int data) {
    struct node *temp = (struct node *)malloc(sizeof(struct node));
    temp->data = data;
    temp->next = head;
    return temp;
}

int main() {
    struct node *head = NULL;
    head = insertAtFront(head, 8);
    head = insertAtFront(head, 6);
    head = insertAtFront(head, 6);
    head = insertAtFront(head, 5);
    
    RemovingDuplicated(head);

    return 0;
}
