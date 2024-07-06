/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode() : val(0), next(nullptr) {}
 *     ListNode(int x) : val(x), next(nullptr) {}
 *     ListNode(int x, ListNode *next) : val(x), next(next) {}
 * };
 */
class Solution {
public:
    void insert (ListNode* &head , int data ){
        if(head == NULL){
            ListNode* add = new ListNode(data);
            head = add;
        }
        else{
            ListNode* temp = head;
            while(temp->next != NULL){
                temp = temp->next;
            }
            ListNode* add = new ListNode(data);
            temp->next = add;
        }    
    }
    ListNode* addTwoNumbers(ListNode* l1, ListNode* l2) {
        ListNode* ans = NULL;   
        ListNode* temp1 = l1;
        ListNode* temp2 = l2;
        int carry = 0;
        while(temp1 != NULL || temp2 != NULL || carry != 0){
            int a,b;
            a=b=0;
            if(temp1!=NULL){
                a = temp1->val;
                temp1 = temp1->next;
            }
            if(temp2!=NULL){
                b = temp2->val;
                temp2 = temp2->next;
            }
            int sum = a + b + carry;
            insert(ans , sum%10);
            carry = sum / 10;

        }
        return ans;
    }
};
