// A number n is represented in Linked List such that each digit corresponds to a node in linked list. You need to add 1 to it. Returns the head of the modified 
// linked list. The driver code prints the number.

// Input: LinkedList: 4->5->6
// Output: 457
// Explanation: 4->5->6 represents 456 and when 1 is added it becomes 457. 



// Solution

//{ Driver Code Starts
//Initial template for C++

#include <bits/stdc++.h> 
using namespace std; 

struct Node
{
    int data;
    struct Node* next;
    
    Node(int x){
        data = x;
        next = NULL;
    }
};

void printList(Node* node) 
{ 
    while (node != NULL) { 
        cout << node->data%10; 
        node = node->next; 
    }  
    cout<<"\n";
} 


// } Driver Code Ends
//User function template for C++

/* 

struct Node
{
    int data;
    struct Node* next;
    
    Node(int x){
        data = x;
        next = NULL;
    }
};

*/

class Solution
{
    public:
    Node* addOne(Node *head) 
    {
        // Your Code here
        // return head of list after adding one
        
        //Reversing The LL
        Node* ahead = head->next;
        Node* middle = head;
        Node* prev = NULL;
        while (ahead != NULL){
             middle->next = prev;
             prev = middle;
             middle = ahead;
             ahead = ahead->next;
        }
        middle->next = prev;
        head = middle;
        
        // Adding 1
        Node* temp = head;
        while(temp != NULL){
            if(temp->data == 9){
                if(temp->next == NULL){
                    temp->data = 0;
                    Node* extra = new Node(1);
                    temp->next = extra;
                    break;
                }
                else{
                    temp->data = 0;
                    temp = temp->next;
                }
            }
            else{
                temp->data += 1;
                break;
            }
        }
        
        // Again Reversing
        Node* ahead1 = head->next;
        Node* middle1 = head;
        Node* prev1 = NULL;
        while (ahead1 != NULL){
             middle1->next = prev1;
             prev1 = middle1;
             middle1 = ahead1;
             ahead1 = ahead1->next;
        }
        middle1->next = prev1;
        head = middle1;
        
    }
};

//{ Driver Code Starts.

int main() 
{ 
    int t;
    cin>>t;
    while(t--)
    {
        string s;
        cin>>s;
        
        Node* head = new Node( s[0]-'0' );
        Node* tail = head;
        for(int i=1; i<s.size(); i++)
        {
            tail->next = new Node( s[i]-'0' );
            tail = tail->next;
        }
        Solution ob;
        head = ob.addOne(head);
        printList(head); 
    }
    return 0; 
} 

// } Driver Code Ends
