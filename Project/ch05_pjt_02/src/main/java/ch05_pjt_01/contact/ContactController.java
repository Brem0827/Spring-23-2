package ch05_pjt_01.contact;

import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import ch05_pjt_01.contact.service.ContactSearchService;

@Controller
public class ContactController {

    @GetMapping("/contactList")
    public String showContactList(Model model) {

        GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("classpath:appCtx.xml");
        ContactSearchService searchService = ctx.getBean("searchService", ContactSearchService.class);

        ContactSet contactSet1 = searchService.searchContact("류현진");
        ContactSet contactSet2 = searchService.searchContact("손흥민");
        ContactSet contactSet3 = searchService.searchContact("김연경");

        ctx.close();

        model.addAttribute("contactSet1", contactSet1);
        model.addAttribute("contactSet2", contactSet2);
        model.addAttribute("contactSet3", contactSet3);

        return "contactList";
    }
}