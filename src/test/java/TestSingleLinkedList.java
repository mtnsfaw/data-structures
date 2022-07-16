import com.atguigu.linkedlist.HeroNode;
import com.atguigu.linkedlist.SingleLinkedList;

/**
 * @Description TODO
 * @Author linjie
 * @Date 2022/5/28 12:26
 * @Version 1.0
 */
public class TestSingleLinkedList {
    public static void main(String[] args) {
        HeroNode heroNode1 = new HeroNode(1, "宋江", "及时雨");
        HeroNode heroNode2 = new HeroNode(2, "卢俊义", "玉麒麟");
        HeroNode heroNode3 = new HeroNode(3, "吴用", "智多星");
        HeroNode heroNode4 = new HeroNode(4, "林冲", "豹子头");
        SingleLinkedList singleLinkedList = new SingleLinkedList();
//        singleLinkedList.add(heroNode1);
//        singleLinkedList.add(heroNode3);
//        singleLinkedList.add(heroNode2);
//        singleLinkedList.add(heroNode4);


        singleLinkedList.addByOrder(heroNode1);
        singleLinkedList.addByOrder(heroNode3);
        singleLinkedList.addByOrder(heroNode2);
        singleLinkedList.addByOrder(heroNode4);
        singleLinkedList.list();

        System.out.println("反转单链表");
        reverseList(singleLinkedList.getHead());
        singleLinkedList.list();
    }

    public static void reverseList(HeroNode head) {
        if(head.next == null || head.next.next == null) {
            return;
        }
        HeroNode cur = head.next;
        HeroNode next = null;// 指向当前节点【cur】的下一个节点
        HeroNode reverseHead = new HeroNode(0, "", "");
        //遍历原来的链表，每遍历一个节点，就将其取出，并放在新的链表reverseHead的最前端
        while (cur != null) {
            next = cur.next;
            cur.next = reverseHead.next;
            reverseHead.next = cur;
            cur = next;
        }
        head.next = reverseHead.next;
    }

}
