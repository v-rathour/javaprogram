package Stack;
public class Dynamic_Stack_client {
    public static void main(String[] args) throws Exception{
        Dynamic_Stack st=new Dynamic_Stack();
        st.push(67);
        st.push(34);
        st.push(89);
        st.push(35);
        st.push(67);
        st.push(34);

        st.Display();

        System.out.println(st.peek());
        st.pop();
        st.Display();
    }


}
