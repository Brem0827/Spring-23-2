package ch04_pjt_03.member;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/members")
public class MemberController {

    private final MemberService memberService;

    public MemberController(MemberService memberService) {
        this.memberService = memberService;
    }

    @GetMapping
    public String listMembers(Model model) {
        Map<String, Member> members = memberService.getAllMembers();
        model.addAttribute("members", members.values());
        return "list-members";
    }

    @GetMapping("/view")
    public String viewMember(@RequestParam String id, Model model) {
        Member member = memberService.getMember(id);
        model.addAttribute("member", member);
        return "view-member";
    }

    @GetMapping("/new")
    public String showNewMemberForm() {
        return "new-member";
    }

    @PostMapping("/new")
    public String addMember(Member newMember) {
        memberService.addMember(newMember);
        return "redirect:/members";
    }

    @GetMapping("/update")
    public String showUpdateForm(@RequestParam String id, Model model) {
        Member member = memberService.getMember(id);
        model.addAttribute("member", member);
        return "update-member";
    }

    @PostMapping("/update")
    public String updateMember(Member updatedMember) {
        memberService.updateMember(updatedMember);
        return "redirect:/members";
    }

    @GetMapping("/delete")
    public String deleteMember(@RequestParam String id) {
        memberService.deleteMember(id);
        return "redirect:/members";
    }
}