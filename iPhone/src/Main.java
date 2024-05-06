import com.phone.iphone.models.musicplayer.DefaultMusicPlayer;
import com.phone.iphone.models.musicplayer.Music;
import com.phone.iphone.models.iPhone;
import com.phone.iphone.models.phone.DefaultDevicePhone;
import com.phone.iphone.models.surfinginternet.DefaultSurfingInternet;

public class Main {
    public static void main(String[] args) {

        iPhone iphone = new iPhone("white", "iPhone 13 Pro");
        iphone.displayPhone();

        /*-----------------------------------------------------------------------------------------------------------*/       Music music = new Music("Yesterday", "Help", "The Beatles", 120);

        DefaultMusicPlayer playMusic = new DefaultMusicPlayer(iphone);
        playMusic.selectionMusic(music);
        playMusic.play();
        playMusic.pause();

        System.out.println("*****************************************************************************************");

       /*-----------------------------------------------------------------------------------------------------------*/
        DefaultDevicePhone devicePhone = new DefaultDevicePhone("1112345678", "Angelica", iphone);

        devicePhone.call();

        devicePhone.answerPhone();

        devicePhone.startPostVoice();

        System.out.println("*****************************************************************************************");

        /**************************************************************************************************************/

        DefaultSurfingInternet internet = new DefaultSurfingInternet("NewBrowser", iphone);
        internet.addPage();

        internet.showPage();

        internet.addPage();

        internet.updatePage();
    }
}