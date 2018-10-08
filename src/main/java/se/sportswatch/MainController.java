package se.sportswatch;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.social.facebook.api.Facebook;
// import org.springframework.social.facebook.api.PagedList;
// import org.springframework.social.facebook.api.Post;
// import org.springframework.social.facebook.api.User;
// import org.springframework.ui.Model;
// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.social.connect.ConnectionRepository;
// import org.springframework.web.bind.annotation.RequestMapping;
// import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class MainController {
    @GetMapping("/")
    public String renderIndex(){
        return "index";
    }

    @GetMapping("/selectFavTeam")
    public String selectFavTeam(){
        return "selectFavTeam";
     }
    // @Autowired
    // private Facebook facebook;
    // private ConnectionRepository connectionRepository;

    // public MainController(Facebook facebook, ConnectionRepository connectionRepository) {
    //     this.facebook = facebook;
    //     this.connectionRepository = connectionRepository;
    // }

    // @RequestMapping(value="feed", method=RequestMethod.GET)
    // public String fbIndex(Model model) {
      
    //     if (connectionRepository.findPrimaryConnection(Facebook.class) == null) {
    //         return "redirect:/connect/facebookConnect";
    //     }

    //     User userProfile = facebook.userOperations().getUserProfile();
    //     model.addAttribute("userProfile", userProfile);
    //     PagedList<Post> userFeed = facebook.feedOperations().getFeed();
    //     model.addAttribute("userFeed", userFeed);
    //     return "feed";
    // }



}