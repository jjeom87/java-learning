package net.sunj.learning.utils.paging;

public class PagingLearn {

	public static void main(String[] args) {
		int page = 22;
		int countList = 10;
		int countPage = 10;
		int totalCount = 255;
		int totalPage = totalCount / countList;
		if (totalCount % countList > 0) {
			totalPage++;
		}

		if (totalPage < page) {
			page = totalPage;
		}

		// 5 일때 10으로 나누면 0.5가 되는데 int형이기 때문에 소수점을 버리고 0이 된다 그래서 첫페이지는 0이된다 거기다 + 1한 경우임
		// 15일 때도 10으로 나누면 1.5가 되는데 int형 이기 때문에 1이된다 그래서 첫페이지는 1이된다 거기서 10으로 곱해서 11이 된다 10으로 하기위해
		// 여기서 -1을 한다.
		int startPage = ((page - 1) / 10) * 10 + 1;
		int endPage = startPage + countPage - 1;

		// page 가 22인경우 총 페이지가 26인데 그냥 위여서 endPage에 conutPage를 더해버리면 30까지 나오게 되니까 페이지수를 총 페이지수로 대체한다.
		if (endPage > totalPage) {
			endPage = totalPage;
		}

		if (startPage > 1) {
			System.out.print("<a href=\"?page=1\">처음</a>");
		}

		if (page > 1) {
			System.out.println("<a href=\"?page=" + (page - 1) + "\">이전</a>");
		}

		for (int iCount = startPage; iCount <= endPage; iCount++) {
			if (iCount == page) {
				System.out.print(" <b>" + iCount + "</b>");
			} else {
				System.out.print(" " + iCount + " ");
			}
		}

		if (page < totalPage) {
			System.out.println("<a href=\"?page=" + (page + 1) + "\">다음</a>");
		}

		if (endPage < totalPage) {
			System.out.print("<a href=\"?page=" + totalPage + "\">끝</a>");
		}
	}
}