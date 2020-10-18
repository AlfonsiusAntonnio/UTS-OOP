import javax.swing.JOptionPane;
public class TiketPesawat {
    void pesantiket(){
        String rute=JOptionPane.showInputDialog("Masukkan Rute Perjalanan");
        String nama=JOptionPane.showInputDialog("Masukkan Nama");
        int umur=Integer.valueOf(JOptionPane.showInputDialog("Masukkan Umur Anda"));
        String maskapai=JOptionPane.showInputDialog("Maskapai yang ingin digunakan"); //Garuda,Lion Air & Air Asia
        String kelas=JOptionPane.showInputDialog("Kelas");


        System.out.println("Nama : "+nama);
        System.out.println("Umur : "+umur +" Tahun");
        System.out.println("Rute Perjalanan : "+rute);
        System.out.println("Maskapai Yang Digunakan : "+maskapai);
        System.out.println("Kelas Penerbangan : "+kelas);


        if(maskapai.equalsIgnoreCase("Garuda") && rute.equalsIgnoreCase("Lombok-Surabaya")){
            if(umur >= 17 && kelas.equalsIgnoreCase("Vip")){
                System.out.println("Harga Rp. " +878000);
            }else if(umur>=17 && kelas.equalsIgnoreCase("Ekonomi")) {
                System.out.println("Harga Rp. " +845000);
            }else if(umur>=1 && kelas.equalsIgnoreCase("Vip")){
                System.out.println("Harga Rp. "+680000);
            }else if(umur>=1 && kelas.equalsIgnoreCase("Ekonomi")){
                System.out.println("Harga Rp. "+ 650000);
            }
        }else if(maskapai.equalsIgnoreCase("Garuda") && rute.equalsIgnoreCase("Surabaya-Lombok")){
            if(umur >= 17 && kelas.equalsIgnoreCase("Vip")){
                System.out.println("Harga Rp. " +895000);
            }else if(umur>=17 && kelas.equalsIgnoreCase("Ekonomi")) {
                System.out.println("Harga Rp. " +870000);
            }else if(umur>=1 && kelas.equalsIgnoreCase("Vip")){
                System.out.println("Harga Rp. "+698000);
            }else if(umur>=1 && kelas.equalsIgnoreCase("Ekonomi")){
                System.out.println("Harga Rp. "+ 675000);
            }
        }else if(maskapai.equalsIgnoreCase("Garuda") && rute.equalsIgnoreCase("Jakarta-Lombok")){
            if(umur >= 17 && kelas.equalsIgnoreCase("Vip")){
                System.out.println("Harga Rp. " +965000);
            }else if(umur>=17 && kelas.equalsIgnoreCase("Ekonomi")) {
                System.out.println("Harga Rp. " +925000);
            }else if(umur>=1 && kelas.equalsIgnoreCase("Vip")){
                System.out.println("Harga Rp. "+850000);
            }else if(umur>=1 && kelas.equalsIgnoreCase("Ekonomi")){
                System.out.println("Harga Rp. "+ 815000);
            }
        }else if(maskapai.equalsIgnoreCase("Garuda") && rute.equalsIgnoreCase("Lombok-Jakarta")){
            if(umur >= 17 && kelas.equalsIgnoreCase("Vip")){
                System.out.println("Harga Rp. " +936000);
            }else if(umur>=17 && kelas.equalsIgnoreCase("Ekonomi")) {
                System.out.println("Harga Rp. " +912000);
            }else if(umur>=1 && kelas.equalsIgnoreCase("Vip")){
                System.out.println("Harga Rp. "+765000);
            }else if(umur>=1 && kelas.equalsIgnoreCase("Ekonomi")){
                System.out.println("Harga Rp. "+ 675000);
            }
        }else if(maskapai.equalsIgnoreCase("Garuda") && rute.equalsIgnoreCase("Lombok-Bali")){
            if(umur >= 17 && kelas.equalsIgnoreCase("Vip")){
                System.out.println("Harga Rp. " +496000);
            }else if(umur>=17 && kelas.equalsIgnoreCase("Ekonomi")) {
                System.out.println("Harga Rp. " +478000);
            }else if(umur>=1 && kelas.equalsIgnoreCase("Vip")){
                System.out.println("Harga Rp. "+380000);
            }else if(umur>=1 && kelas.equalsIgnoreCase("Ekonomi")){
                System.out.println("Harga Rp. "+ 330000);
            }
        }else if(maskapai.equalsIgnoreCase("Garuda") && rute.equalsIgnoreCase("Bali-Lombok")){
            if(umur >= 17 && kelas.equalsIgnoreCase("Vip")){
                System.out.println("Harga Rp. " +505000);
            }else if(umur>=17 && kelas.equalsIgnoreCase("Ekonomi")) {
                System.out.println("Harga Rp. " +490000);
            }else if(umur>=1 && kelas.equalsIgnoreCase("Vip")){
                System.out.println("Harga Rp. "+399000);
            }else if(umur>=1 && kelas.equalsIgnoreCase("Ekonomi")){
                System.out.println("Harga Rp. "+ 345000);
            }
        }else if(maskapai.equalsIgnoreCase("Lion Air") && rute.equalsIgnoreCase("Lombok-Surabaya")){
            if(umur >= 17 && kelas.equalsIgnoreCase("Vip")){
                System.out.println("Harga Rp. " +820000);
            }else if(umur>=17 && kelas.equalsIgnoreCase("Ekonomi")) {
                System.out.println("Harga Rp. " +786000);
            }else if(umur>=1 && kelas.equalsIgnoreCase("Vip")){
                System.out.println("Harga Rp. "+650000);
            }else if(umur>=1 && kelas.equalsIgnoreCase("Ekonomi")){
                System.out.println("Harga Rp. "+ 619000);
            }
        }else if(maskapai.equalsIgnoreCase("Lion Air") && rute.equalsIgnoreCase("Surabaya-Lombok")){
            if(umur >= 17 && kelas.equalsIgnoreCase("Vip")){
                System.out.println("Harga Rp. " +875000);
            }else if(umur>=17 && kelas.equalsIgnoreCase("Ekonomi")) {
                System.out.println("Harga Rp. " +795000);
            }else if(umur>=1 && kelas.equalsIgnoreCase("Vip")){
                System.out.println("Harga Rp. "+665000);
            }else if(umur>=1 && kelas.equalsIgnoreCase("Ekonomi")){
                System.out.println("Harga Rp. "+ 620000);
            }
        }else if(maskapai.equalsIgnoreCase("Lion Air") && rute.equalsIgnoreCase("Jakarta-Lombok")){
            if(umur >= 17 && kelas.equalsIgnoreCase("Vip")){
                System.out.println("Harga Rp. " +935000);
            }else if(umur>=17 && kelas.equalsIgnoreCase("Ekonomi")) {
                System.out.println("Harga Rp. " +886000);
            }else if(umur>=1 && kelas.equalsIgnoreCase("Vip")){
                System.out.println("Harga Rp. "+837000);
            }else if(umur>=1 && kelas.equalsIgnoreCase("Ekonomi")){
                System.out.println("Harga Rp. "+ 769000);
            }
        }else if(maskapai.equalsIgnoreCase("Lion Air") && rute.equalsIgnoreCase("Lombok-Jakarta")){
            if(umur >= 17 && kelas.equalsIgnoreCase("Vip")){
                System.out.println("Harga Rp. " +920000);
            }else if(umur>=17 && kelas.equalsIgnoreCase("Ekonomi")) {
                System.out.println("Harga Rp. " +856000);
            }else if(umur>=1 && kelas.equalsIgnoreCase("Vip")){
                System.out.println("Harga Rp. "+760000);
            }else if(umur>=1 && kelas.equalsIgnoreCase("Ekonomi")){
                System.out.println("Harga Rp. "+ 705000);
            }
        }else if(maskapai.equalsIgnoreCase("Lion Air") && rute.equalsIgnoreCase("Lombok-Bali")){
            if(umur >= 17 && kelas.equalsIgnoreCase("Vip")){
                System.out.println("Harga Rp. " +485000);
            }else if(umur>=17 && kelas.equalsIgnoreCase("Ekonomi")) {
                System.out.println("Harga Rp. " +468000);
            }else if(umur>=1 && kelas.equalsIgnoreCase("Vip")){
                System.out.println("Harga Rp. "+365000);
            }else if(umur>=1 && kelas.equalsIgnoreCase("Ekonomi")){
                System.out.println("Harga Rp. "+ 310000);
            }
        }else if(maskapai.equalsIgnoreCase("Lion Air") && rute.equalsIgnoreCase("Bali-Lombok")){
            if(umur >= 17 && kelas.equalsIgnoreCase("Vip")){
                System.out.println("Harga Rp. " +485000);
            }else if(umur>=17 && kelas.equalsIgnoreCase("Ekonomi")) {
                System.out.println("Harga Rp. " +420000);
            }else if(umur>=1 && kelas.equalsIgnoreCase("Vip")){
                System.out.println("Harga Rp. "+376000);
            }else if(umur>=1 && kelas.equalsIgnoreCase("Ekonomi")){
                System.out.println("Harga Rp. "+ 337000);
            }
        }else if(maskapai.equalsIgnoreCase("Air Asia") && rute.equalsIgnoreCase("Lombok-Surabaya")){
            if(umur >= 17 && kelas.equalsIgnoreCase("Vip")){
                System.out.println("Harga Rp. " +809000);
            }else if(umur>=17 && kelas.equalsIgnoreCase("Ekonomi")) {
                System.out.println("Harga Rp. " +781000);
            }else if(umur>=1 && kelas.equalsIgnoreCase("Vip")){
                System.out.println("Harga Rp. "+649000);
            }else if(umur>=1 && kelas.equalsIgnoreCase("Ekonomi")){
                System.out.println("Harga Rp. "+ 615000);
            }
        }else if(maskapai.equalsIgnoreCase("Air Asia") && rute.equalsIgnoreCase("Surabaya-Lombok")){
            if(umur >= 17 && kelas.equalsIgnoreCase("Vip")){
                System.out.println("Harga Rp. " +830000);
            }else if(umur>=17 && kelas.equalsIgnoreCase("Ekonomi")) {
                System.out.println("Harga Rp. " +791000);
            }else if(umur>=1 && kelas.equalsIgnoreCase("Vip")){
                System.out.println("Harga Rp. "+635000);
            }else if(umur>=1 && kelas.equalsIgnoreCase("Ekonomi")){
                System.out.println("Harga Rp. "+ 619000);
            }
        }else if(maskapai.equalsIgnoreCase("Air Asia") && rute.equalsIgnoreCase("Jakarta-Lombok")){
            if(umur >= 17 && kelas.equalsIgnoreCase("Vip")){
                System.out.println("Harga Rp. " +905000);
            }else if(umur>=17 && kelas.equalsIgnoreCase("Ekonomi")) {
                System.out.println("Harga Rp. " +860000);
            }else if(umur>=1 && kelas.equalsIgnoreCase("Vip")){
                System.out.println("Harga Rp. "+815000);
            }else if(umur>=1 && kelas.equalsIgnoreCase("Ekonomi")){
                System.out.println("Harga Rp. "+ 720000);
            }
        }else if(maskapai.equalsIgnoreCase("Air Asia") && rute.equalsIgnoreCase("Lombok-Jakarta")){
            if(umur >= 17 && kelas.equalsIgnoreCase("Vip")){
                System.out.println("Harga Rp. " +890000);
            }else if(umur>=17 && kelas.equalsIgnoreCase("Ekonomi")) {
                System.out.println("Harga Rp. " +845000);
            }else if(umur>=1 && kelas.equalsIgnoreCase("Vip")){
                System.out.println("Harga Rp. "+726000);
            }else if(umur>=1 && kelas.equalsIgnoreCase("Ekonomi")){
                System.out.println("Harga Rp. "+ 699500);
            }
        }else if(maskapai.equalsIgnoreCase("Air Asia") && rute.equalsIgnoreCase("Lombok-Bali")){
            if(umur >= 17 && kelas.equalsIgnoreCase("Vip")){
                System.out.println("Harga Rp. " +460000);
            }else if(umur>=17 && kelas.equalsIgnoreCase("Ekonomi")) {
                System.out.println("Harga Rp. " +410000);
            }else if(umur>=1 && kelas.equalsIgnoreCase("Vip")){
                System.out.println("Harga Rp. "+325000);
            }else if(umur>=1 && kelas.equalsIgnoreCase("Ekonomi")){
                System.out.println("Harga Rp. "+ 298000);
            }
        }else if(maskapai.equalsIgnoreCase("Air Asia") && rute.equalsIgnoreCase("Bali-Lombok")){
            if(umur >= 17 && kelas.equalsIgnoreCase("Vip")){
                System.out.println("Harga Rp. " +467000);
            }else if(umur>=17 && kelas.equalsIgnoreCase("Ekonomi")) {
                System.out.println("Harga Rp. " +415000);
            }else if(umur>=1 && kelas.equalsIgnoreCase("Vip")){
                System.out.println("Harga Rp. "+365000);
            }else if(umur>=1 && kelas.equalsIgnoreCase("Ekonomi")){
                System.out.println("Harga Rp. "+ 325000);
            }
        }else{
            JOptionPane.showMessageDialog(null, "Data Yang Anda Masukkan Salah");
        }

    }
    public static void main(String[] args) {
        TiketPesawat tik=new TiketPesawat();
        tik.pesantiket();
    }

}