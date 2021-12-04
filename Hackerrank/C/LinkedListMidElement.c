
#include<stdio.h>
#include<stdlib.h>
struct node
{
	int data;
	struct node* next;
};

struct node *head, *current, *temp;

void getMidValue()
{
    int count = 0;
	temp = head;
	while(temp != NULL){
	    count ++;
	    temp = temp->next;
	}
	int mid = count/2;
	count = 0;
	temp = head;
	while(count != mid){
	    temp = temp ->next;
	    count ++;
	}
	printf("Mid Value: %d", temp -> data);
}


// use this method
void printMiddle(struct Node *head)
{
    struct Node *slow_ptr = head;
    struct Node *fast_ptr = head;
 
    if (head!=NULL)
    {
        while (fast_ptr != NULL && fast_ptr->next != NULL)
        {
            fast_ptr = fast_ptr->next->next;
            slow_ptr = slow_ptr->next;
        }
        printf("The middle element is [%d]\n\n", slow_ptr->data);
    }
}

void push(int data)
{
	struct node* node =
		(struct node*) malloc(sizeof(struct node));
	node->data = data;
	node->next = NULL;
// 	printf("%d", node->data);
	if(head == NULL){
	    head = node;
	    current = node;g
	}
	else{
	    current->next = node;
	    current = node;
	}
}


void printList()
{
    temp = head;
	while (temp != NULL)
	{
		printf("%d ", temp->data);
		temp = temp->next;
	}
	printf("\n");
}

int main()
{
	struct Node* head = NULL;
	int i, n;
	printf("Enter the number of elemnts: ");
	scanf("%d", &n);

	for (i=1; i<=n; i++)
	{
	   // printf("data: %d", i);
		push(i);
	}
	printList();
	getMidValue();

	return 0;
}
