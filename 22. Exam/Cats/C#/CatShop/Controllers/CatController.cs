namespace CatShop.Controllers
{
    using Microsoft.AspNetCore.Mvc;
    using CatShop.Models;
    using System.Linq;

    public class CatController : Controller
    {
        private readonly CatDbContext context;

        public CatController(CatDbContext context)
        {
            this.context = context;
        }

        [HttpGet]
        [Route("")]
        public ActionResult Index()
        {
            var cats = context.Cats.ToList();
            return View(cats);
        }

        [HttpGet]
        [Route("create")]
        public ActionResult Create()
        {
            return View();
        }

        [HttpPost]
        [Route("create")]
        public ActionResult Create(Cat cat)
        {
            context.Cats.Add(cat);
            context.SaveChanges();
            return RedirectToAction(nameof(Index));
        }

        [HttpGet]
        [Route("edit/{id}")]
        public ActionResult Edit(int id)
        {
            var prop = context.Cats
                .Where(p => p.Id == id)
                .FirstOrDefault();

            return View(prop);
        }

        [HttpPost]
        [Route("edit/{id}")]
        [ValidateAntiForgeryToken]
        public ActionResult EditConfirm(int id, Cat catModel)
        {
            var prop = context.Cats
                .Where(p => p.Id == id)
                .FirstOrDefault();

            prop.Name = catModel.Name;
            prop.Nickname = catModel.Nickname;
            prop.Price = catModel.Price;

            context.Update(prop);
            context.SaveChanges();
            return RedirectToAction("Index");
        }

        [HttpGet]
        [Route("delete/{id}")]
        public ActionResult Delete(int id)
        {
            var prop = context.Cats
              .Where(p => p.Id == id)
              .FirstOrDefault();

            return View(prop);
        }

        [HttpPost]
        [Route("delete/{id}")]
        [ValidateAntiForgeryToken]
        public ActionResult DeleteConfirm(int id, Cat catModel)
        {
            var prop = context.Cats
                 .Where(p => p.Id == id)
                 .FirstOrDefault();

            context.Cats.Remove(prop);
            context.SaveChanges();
            return RedirectToAction("Index");
        }
    }
}
