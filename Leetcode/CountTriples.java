//Question Number-->1925

class CountTriples {
    public int countTriples(int n) {
        int count=0;
        for(int i=2;i<=n;i++){
            for(int j=i+1;j<n;j++){
                int f=i*i+j*j;
                int r=(int)Math.sqrt(f);
                if(r*r==f && r<=n){
                    count+=2;
                }
            }
        }
        return count;
    }
}
