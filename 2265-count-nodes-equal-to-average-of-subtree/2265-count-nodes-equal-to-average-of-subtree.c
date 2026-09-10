/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     struct TreeNode *left;
 *     struct TreeNode *right;
 * };
 */
 int count = 0 ;
 int sum1(struct TreeNode* root){
    if(root==NULL)
    return 0 ;
    return root->val + sum1(root->left)+sum1(root->right);
 }
 int countN(struct TreeNode* root){
    if(root==NULL)
    return 0 ;
    return 1+countN(root->left)+countN(root->right);

 }
 void check(struct TreeNode* root){
    if(root==NULL)
    return  ;

    int sum=sum1(root);
    int nodes = countN(root);

    int average=sum/nodes ;
    if(average == root->val)
    count++ ;
    check(root->left);
    check(root->right);


 }
int averageOfSubtree(struct TreeNode* root) {
count=0 ;
check(root);
return count ;


}