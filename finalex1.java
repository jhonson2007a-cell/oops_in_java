class finalex1 {
    void showdata(){
        System.out.println("hello form finalex1 base class....");
    }}
        
        
       class der extends finalex1{ 
        void showdata(){
            
        System.out.println("hello form der base class....");
    } //over redden means over writting 
        public static void main(String[] args){
            der ob=new der();
            ob.showdata();

        }
        public void showdata(int i, String string) {
            // TODO Auto-generated method stub
            throw new UnsupportedOperationException("Unimplemented method 'showdata'");
        }
    }    

