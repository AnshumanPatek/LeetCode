class Solution {
public:
    ListNode* middleNode(ListNode* head) {
        ListNode* slow = head;
        ListNode* fast = head;
        while(fast!=NULL){
           if(fast->next==NULL){
               return slow;
            }
            slow = slow->next;
           
            fast = fast->next->next;
        }
        return slow;
     
        
    }
};
