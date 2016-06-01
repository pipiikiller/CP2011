import java.util.Stack;
/**
 * 
 * @author WinHan
 *This class contains the root of the tree
 */
public class Node
{
    private TreeNode root;
    
/**
 * This method functions to implement the root element of the tree in which it contains key and value of the data
 * @param key
 * @param value
 * 
 * check if root =null{
 *		root == new TreeNode(key,value) 
 * 	}else{
 * root.put(key,value) // recursive function 
 * }
 */
    public void put( String key, Object value )
    {
        if ( root == null )
        {
            root = new TreeNode( key, value );
           //System.out.println(root.toString());
        }
        else
        {
            root.put( key, value );
            //System.out.println(root);
        }
    }
/**
 * This method is to retrieve the data by accepting key as parameter
 * @param key
 * @return root
 * 
 */
    public Object get( String key )
    {
        return root == null ? null : root.get( key );// checking the root is null or not
    }
    
    
    
    }